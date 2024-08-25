package ru.klasix12.java_questions.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "questions")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;
    private Difference difference;
    private String theme;
}
