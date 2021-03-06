package dev.Trivia.repository;


import dev.Trivia.entitati.Utilizatori;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Utilizatori, Integer> {

    Utilizatori findByEmail(String name);

}