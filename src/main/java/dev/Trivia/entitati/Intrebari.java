package dev.Trivia.entitati;

import javax.persistence.*;

@Entity
public class Intrebari {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_intrebare;

    private String text_intrebare;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Categorii categorii;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private  OptiuniRaspuns optiuniRaspuns;

    public Intrebari(String text_intrebare, Categorii categorii, OptiuniRaspuns optiuniRaspuns) {
        this.text_intrebare = text_intrebare;
        this.categorii = categorii;
        this.optiuniRaspuns = optiuniRaspuns;
    }

    public Intrebari() {
    }

    public String getText_intrebare() {
        return text_intrebare;
    }

    public void setText_intrebare(String text_intrebare) {
        this.text_intrebare = text_intrebare;
    }

    public Categorii getCategorii() {
        return categorii;
    }

    public void setCategorii(Categorii categorii) {
        this.categorii = categorii;
    }

    public OptiuniRaspuns getOptiuniRaspuns() {
        return optiuniRaspuns;
    }

    public void setOptiuniRaspuns(OptiuniRaspuns optiuniRaspuns) {
        this.optiuniRaspuns = optiuniRaspuns;
    }
}
