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

    public OptiuniRaspuns(String opt1, String opt2, String opt3, String opt4, String raspuns_corect) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.raspuns_corect = raspuns_corect;
    }

    public OptiuniRaspuns() {
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getRaspuns_corect() {
        return raspuns_corect;
    }

    public void setRaspuns_corect(String raspuns_corect) {
        this.raspuns_corect = raspuns_corect;
    }
}
