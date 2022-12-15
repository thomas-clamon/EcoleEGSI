package com.egsi.ecoleegsi.ressources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PrintName")
public class PrintName {

    @GetMapping("biram")
    // New endpoint to say my name
    public String test()
    {
        return "Biram, 21 ans";
    }
}
