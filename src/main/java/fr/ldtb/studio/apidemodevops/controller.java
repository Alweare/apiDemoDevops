package fr.ldtb.studio.apidemodevops;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class controller {
//il était une fois un petit pushazeazeaze
@GetMapping("/aidemoi")
    public Formateur gregory() {
    String test = "";
//azeazeaazeazeazeazeazeazea
//azeazeiititititititit
    return  new Formateur("Francois", "francois@alaide.fr", LocalDateTime.now());
}
@GetMapping()
    public Formateur Arnaud() {
    String test = "";
//azeazeaazeazeazeazeazeazea
//azeazeiititititititit
    return  new Formateur("Arnaud", "Arnaud@alaide.fr", LocalDateTime.now());
}

//azeazeazeaze
//le dernier test ?
}
