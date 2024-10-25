package fr.ldtb.studio.apidemodevops;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
//c'est ce qui en fait une API REST MDR
@RestController
@RequestMapping("/")
public class controller {

@GetMapping("/aidemoi")
    public Formateur gregory() {
    String test = "";

    return  new Formateur("Francois", "francois@alaide.fr", LocalDateTime.now());
}
@GetMapping()
    public Formateur Arnaud() {
    String test = "";

    return  new Formateur("Arnaud", "Arnaud@alaide.fr", LocalDateTime.now());
}


}
