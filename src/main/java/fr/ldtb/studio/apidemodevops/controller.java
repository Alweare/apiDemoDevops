package fr.ldtb.studio.apidemodevops;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class controller {

@GetMapping("/gregory/aidemoi")
    public Formateur gregory() {

    return  new Formateur("Francois", "francois@alaide.fr", LocalDateTime.now());
}
    @GetMapping("/")
    public Formateur Fred() {

        return  new Formateur("FredoLEfoufo", "fred@alaide.fr", LocalDateTime.now());
    }
}
