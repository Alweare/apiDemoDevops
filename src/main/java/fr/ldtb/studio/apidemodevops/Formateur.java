package fr.ldtb.studio.apidemodevops;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@AllArgsConstructor
public class Formateur {
    private String nom;
    private String email;
    private LocalDateTime date;

}
