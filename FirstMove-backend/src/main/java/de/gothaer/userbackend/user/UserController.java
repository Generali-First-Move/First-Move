package de.gothaer.userbackend.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController //verarbeitet HTTP anfragen (get, post, etc.)
@RequestMapping("/api/cats")
public class UserController
{
    private UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping // findet alle Benutzer als Liste
    public ResponseEntity<List<User>> getAll()
    {
      return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}") // findet nach ID
    public ResponseEntity<User> findOne(@PathVariable Long id)
    {
        return ResponseEntity.ok(userService.findById(id));
    }
    //PathVariable bindet die URL ../id an die ID aus der Klasse User

    @PutMapping("/change")
    public ResponseEntity<User> updateOne(@Valid @RequestBody User user){
        //RequestBody mapped den HTTPRequest. Lässt das arbeiten des HTTPRequest mit Java Objecten zu
        //Valid prüft ob Argumente valide sind. Fall nicht wird MethodArgumentNotValidException

        if (user.getId() <= userService.findAll().size()){
            User master = UserService.findById(user.getId());
            master.setAddress(user.getAddress());
            master.setName(user.getName());
            final User updatecat = userService.save(master);
            return ResponseEntity.ok(updatecat);
        }
        else {
            return addcat(user);
        }
    }

    @PostMapping
    public ResponseEntity<User> addcat (@RequestBody User user)
    {
        User newcat = userService.save(user);
        return ResponseEntity.created(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newcat.getId())
                .toUri())
                .body(newcat);
    }
}
