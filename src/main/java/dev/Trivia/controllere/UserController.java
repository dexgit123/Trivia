package dev.Trivia.controllere;

import dev.Trivia.dto.UserDTO;
import dev.Trivia.servicii.UserService;
import dev.Trivia.dto.UserSignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO){
        boolean response = userService.validateUser(userDTO);
        if(response){
            return ResponseEntity.accepted().body("Bine Ai Venit");
        } else
            return ResponseEntity.badRequest().body("Utilizator sau parola gresita");
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserSignupDTO userSignupDTO){

        userService.createAndSaveUser(userSignupDTO);
        return ResponseEntity.ok("User salvat");
    }



}
