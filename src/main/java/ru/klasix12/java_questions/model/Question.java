package ru.klasix12.java_questions.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "questions")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;
    private Difference difference;
    private String theme;
    private Language language;

    @OneToOne(cascade = CascadeType.ALL)
    private Answer answer;
}
