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
    public ResponseEntity<List<FirstMove>> getAll()
    {
      return ResponseEntity.ok(firstMoveService.findAll());
    }

    @GetMapping("/{id}") // findet nach ID
    public ResponseEntity<FirstMove> findOne(@PathVariable Long id)
    {
        return ResponseEntity.ok(firstMoveService.findById(id));
    }
    //PathVariable bindet die URL ../id an die ID aus der Klasse FirstMove

    @PutMapping("/change")
    public ResponseEntity<FirstMove> updateOne(@Valid @RequestBody FirstMove firstMove){
        //RequestBody mapped den HTTPRequest. Lässt das arbeiten des HTTPRequest mit Java Objecten zu
        //Valid prüft ob Argumente valide sind. Fall nicht wird MethodArgumentNotValidException

        if (firstMove.getId() <= firstMoveService.findAll().size()){
            FirstMove master = FirstMoveService.findById(firstMove.getId());
            master.setAddress(firstMove.getAddress());
            master.setName(firstMove.getName());
            final FirstMove updatecat = firstMoveService.save(master);
            return ResponseEntity.ok(updatecat);
        }
        else {
            return addcat(firstMove);
        }
    }

    @PostMapping
    public ResponseEntity<FirstMove> addcat (@RequestBody FirstMove firstMove)
    {
        FirstMove newcat = firstMoveService.save(firstMove);
        return ResponseEntity.created(ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newcat.getId())
                .toUri())
                .body(newcat);
    }
}
