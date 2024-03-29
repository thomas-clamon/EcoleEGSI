package com.egsi.ecoleegsi.ressources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Etudiant")
public class EtudiantRessources {

    @GetMapping("hello")
    // New endpoint to say hello
    public String test()
    {
        return "Bonjour";
    }

    @GetMapping("ryan")
    // New endpoint to get full name of ryan
    public String fullName() {
        return "CHAMBRE_Ryan";
    }

    @GetMapping("thomas")
    public String toto(){
        return "Thomas CLAMON 32 ans";
    }

    @GetMapping("calista")
    // New endpoint to say hello
    public String print_calista()
    {
        return "Calista Martinez 20 ans";
    }
}
