package com.egsi.ecoleegsi.ressources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Etudiant")
public class EtudiantRessourcesYoan {

    @GetMapping("yoan")
    // New endpoint to say hello
    public String test()
    {
        return "Bonjour, moi c'est Yoan MARTINS";
    }
}
