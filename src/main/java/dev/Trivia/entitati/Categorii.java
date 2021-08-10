package dev.Trivia.entitati;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorii {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_categ;

    private String nume_categ;


    public Categorii(String nume_categ) {
        this.nume_categ = nume_categ;
    }

    public Categorii() {
    }

    public String getNume_categ() {
        return nume_categ;
    }

    public void setNume_categ(String nume_categ) {
        this.nume_categ = nume_categ;
    }
}
