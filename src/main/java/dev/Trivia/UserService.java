package dev.Trivia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public List<User> getUsers(){
        List<User> userList = new ArrayList<>();
// aici creez lista de useri si am convertit din iterable to list
        userRepository
                .findAll()
                .iterator()
                .forEachRemaining(userList::add);

        return userList;
    }


}
