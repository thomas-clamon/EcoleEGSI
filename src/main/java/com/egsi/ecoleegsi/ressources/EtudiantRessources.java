package com.egsi.ecoleegsi.ressources;

import com.egsi.ecoleegsi.dto.EtudiantDto;
import com.egsi.ecoleegsi.dto.Matiere;
import com.egsi.ecoleegsi.dto.MatiereDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Etudiant")
public class EtudiantRessources {
    @PostMapping("age")
    public Integer afficherAge(@RequestBody EtudiantDto dto){
        return dto.calculerAge();
    }

    @PostMapping("matiere")
    public String afficherIntituler(@RequestBody MatiereDTO dto){
        return dto.getIntitule();
    }
}
