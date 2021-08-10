package dev.Trivia.controllere;

import dev.Trivia.dto.UserDTO;
import dev.Trivia.servicii.UserService;
import dev.Trivia.dto.UserSignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/login")
//    public ResponseEntity<String> login(@RequestBody UserDTO userDTO){
//
//    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserSignupDTO userSignupDTO){

        userService.createAndSaveUser(userSignupDTO);
        return ResponseEntity.ok("User salvat");
    }



}
