package ru.klasix12.java_questions.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "answers")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String rightAnswer;
    private String fakeAnswer1;
    private String fakeAnswer2;
    private String fakeAnswer3;
}
