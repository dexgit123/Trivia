package dev.Trivia.servicii;

import dev.Trivia.dto.UserDTO;
import dev.Trivia.enums.Role;
import dev.Trivia.dto.UserSignupDTO;
import dev.Trivia.entitati.Utilizatori;
import dev.Trivia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createAndSaveUser (UserSignupDTO userSignupDTO){
        Utilizatori utilizatori = new Utilizatori();
        utilizatori.setEmail(userSignupDTO.email);
        utilizatori.setName_utilizator(userSignupDTO.name);
        utilizatori.setParola(userSignupDTO.password);
        utilizatori.setTip_user(Role.USER);

        userRepository.save(utilizatori);
    }

    public boolean validateUser(UserDTO userDTO){
        Utilizatori user =  userRepository.findByEmail(userDTO.email);
        return userDTO.password.equals(user.getParola());

    }


}
