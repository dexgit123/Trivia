package dev.Trivia.controllere;

import dev.Trivia.dto.IntrebareDTO;
import dev.Trivia.dto.ResponseDTO;
import dev.Trivia.entitati.Categorii;
import dev.Trivia.entitati.Intrebari;
import dev.Trivia.entitati.OptiuniRaspuns;
import dev.Trivia.repository.IntrebariRepository;
import dev.Trivia.servicii.IntrebariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/intrebari")
public class IntrebariController {

    @Autowired
    IntrebariService intrebariService;

    @PostMapping("/save")
    public ResponseEntity<ResponseDTO> adaugaIntrebare(@RequestBody IntrebareDTO intrebareDTO){
        intrebariService.createAndSaveIntrebare(intrebareDTO);
        return ResponseEntity.ok(new ResponseDTO("Intrebare salvata"));

    }

    @GetMapping("/{categorie}")
    public ResponseEntity<IntrebareDTO> getIntrebare(@PathVariable String categorie){
        return ResponseEntity.ok(intrebariService.findIntrebareByCategorie(categorie));

    }
}
