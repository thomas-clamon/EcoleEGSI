package com.egsi.ecoleegsi.ressources;

import com.egsi.ecoleegsi.dto.EtudiantDto;
import com.egsi.ecoleegsi.dto.MatiereDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Matiere")
public class MatiereRessources {
    @PostMapping("nom")
    public String printMatiere(@RequestBody MatiereDto dto){
        return dto.toString();
    }
}
