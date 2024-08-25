package ru.klasix12.java_questions.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "theme")
@Data
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
