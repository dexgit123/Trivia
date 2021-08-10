package dev.Trivia.dto;

public class UserSignupDTO {

    public String email;
    public String name;
    public String password;

    public UserSignupDTO(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;

    }

    public UserSignupDTO() {

    }


}
