package de.gothaer.firstmove.FirstMove;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController //verarbeitet HTTP anfragen (get, post, etc.)
@RequestMapping("/api/cats")
public class FirstMoveController
{
    private FirstMoveService firstMoveService;

    public FirstMoveController(FirstMoveService firstMoveService)
    {
        this.firstMoveService = firstMoveService;
    }

    @GetMapping // findet alle Benutzer als Liste
    public ResponseEntity<List<FirstMoveClass>> getAll()
    {
      return ResponseEntity.ok(firstMoveService.findAll());
    }

    @GetMapping("/{id}") // findet nach ID
    public ResponseEntity<FirstMoveClass> findOne(@PathVariable Long id)
    {
        return ResponseEntity.ok(firstMoveService.findById(id));
    }
    //PathVariable bindet die URL ../id an die ID aus der Klasse FirstMoveClass

    @PutMapping("/change")
    public ResponseEntity<FirstMoveClass> updateOne(@Valid @RequestBody FirstMoveClass firstMoveClass){
        //RequestBody mapped den HTTPRequest. Lässt das arbeiten des HTTPRequest mit Java Objecten zu
        //Valid prüft ob Argumente valide sind. Fall nicht wird MethodArgumentNotValidException

        if (firstMoveClass.getId() <= firstMoveService.findAll().size()){
            FirstMoveClass master = FirstMoveService.findById(firstMoveClass.getId());
            master.setAddress(firstMoveClass.getAddress());
            master.setName(firstMoveClass.getName());
            final FirstMoveClass updatecat = firstMoveService.save(master);
            return ResponseEntity.ok(updatecat);
        }
        else {
            return addcat(firstMoveClass);
        }
    }

    @PostMapping
    public ResponseEntity<FirstMoveClass> addcat (@RequestBody FirstMoveClass firstMoveClass)
    {
        FirstMoveClass newcat = firstMoveService.save(firstMoveClass);
        return ResponseEntity.created(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newcat.getId())
                .toUri())
                .body(newcat);
    }
}
