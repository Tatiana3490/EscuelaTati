package com.svalero.EscuelaTati.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Cursos {

        private int id;
        private String name;
        private String description;


}
