package fr.ldtb.studio.apidemodevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
//c'est ce qui en fait une API REST MDR
@RestController
@RequestMapping("/")
public class controller {

@GetMapping("aidemoi")
    public Formateur gregory() {
    return  new Formateur("Francois", "francois@alaide.fr", LocalDateTime.now());
}
@GetMapping()
    public Formateur Arnaud() {
    return  new Formateur("Arnaud", "Arnaud@alaide.fr", LocalDateTime.now());
}

//ouioui
}
