package com.egsi.ecoleegsi.ressources;

import com.egsi.ecoleegsi.dto.EtudiantDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Etudiant")
public class EtudiantRessources {
    @PostMapping("age")
    public Integer afficherAge(@RequestBody EtudiantDto dto){
        return dto.calculerAge();
    }
}
