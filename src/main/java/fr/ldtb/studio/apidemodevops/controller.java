package fr.ldtb.studio.apidemodevops;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class controller {
//il était une fois un petit pushazeazeaze
@GetMapping("/gregory/aidemoi")
    public Formateur gregory() {
    String test = "";
//azeazeaazeazeazeazeazeazea
//azeazeiititititititit
    return  new Formateur("Francois", "francois@alaide.fr", LocalDateTime.now());
}
    @GetMapping("/")
    public Formateur Fred() {
        String test = "";
//azeazeaazeazeazeazeazeazea
//azeazeiititititititit
        return  new Formateur("Francois", "francois@alaide.fr", LocalDateTime.now());
    }
//azeazeazeaze
//le dernier test ?
}
