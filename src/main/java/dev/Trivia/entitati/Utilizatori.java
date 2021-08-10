package dev.Trivia.entitati;

import dev.Trivia.enums.Role;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"email"}) })
public class Utilizatori {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name_utilizator;

    private String email;

    private String parola;

    @Enumerated(EnumType.STRING)
    private Role tip_user;

    public Utilizatori() {
    }

    public Utilizatori(String name_utilizator, String email, String parola, Role tip_user) {
        this.name_utilizator = name_utilizator;
        this.email = email;
        this.parola = parola;
        this.tip_user = tip_user;
    }

    public String getName_utilizator() {
        return name_utilizator;
    }

    public void setName_utilizator(String name_utilizator) {
        this.name_utilizator = name_utilizator;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Role getTip_user() {
        return tip_user;
    }

    public void setTip_user(Role tip_user) {
        this.tip_user = tip_user;
    }
}