package dev.Trivia.entitati;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OptiuniRaspuns {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_opt_rasp;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String raspuns_corect;


}
