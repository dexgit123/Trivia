package dev.Trivia.servicii;

import dev.Trivia.dto.IntrebareDTO;
import dev.Trivia.entitati.Categorii;
import dev.Trivia.entitati.Intrebari;
import dev.Trivia.entitati.OptiuniRaspuns;
import dev.Trivia.repository.IntrebariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class IntrebariService {

    @Autowired
    IntrebariRepository intrebariRepository;

    public void createAndSaveIntrebare(IntrebareDTO intrebareDTO){
        Intrebari intrebare = new Intrebari();
        Categorii categorii = new Categorii();
        OptiuniRaspuns opt = new OptiuniRaspuns();

        opt.setOpt1(intrebareDTO.opt1);
        opt.setOpt2(intrebareDTO.opt2);
        opt.setOpt3(intrebareDTO.opt3);
        opt.setOpt4(intrebareDTO.opt4);
        opt.setRaspuns_corect(intrebareDTO.raspunsCorect);

        categorii.setNume_categ(intrebareDTO.categorie);

        intrebare.setText_intrebare(intrebareDTO.textIntrebare);
        intrebare.setCategorii(categorii);
        intrebare.setOptiuniRaspuns(opt);

        intrebariRepository.save(intrebare);
    }

    private List<Intrebari> findAllIntrebariByCategorie(String categorie){
        List<Intrebari> intrebari = new LinkedList<>();
        intrebariRepository.findAll().forEach(intrebari::add);

        List<Intrebari> intrebariSortate = new LinkedList<>();
        for(Intrebari intrebare : intrebari){
            if(intrebare.getCategorii().getNume_categ().equals(categorie))
                intrebariSortate.add(intrebare);
        }

        return intrebariSortate;
    }

    public IntrebareDTO findIntrebareByCategorie(String categorie){
        Intrebari intrebare = findAllIntrebariByCategorie(categorie).get(0);
        IntrebareDTO intrebareDTO = new IntrebareDTO();

        intrebareDTO.textIntrebare = intrebare.getText_intrebare();
        intrebareDTO.categorie = categorie;

        intrebareDTO.opt1 = intrebare.getOptiuniRaspuns().getOpt1();
        intrebareDTO.opt2 = intrebare.getOptiuniRaspuns().getOpt2();
        intrebareDTO.opt3 = intrebare.getOptiuniRaspuns().getOpt3();
        intrebareDTO.opt4 = intrebare.getOptiuniRaspuns().getOpt4();
        intrebareDTO.raspunsCorect = intrebare.getOptiuniRaspuns().getRaspuns_corect();

        return intrebareDTO;
    }
}
