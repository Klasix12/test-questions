package ru.klasix12.java_questions.model;

import lombok.Data;

@Data
public class QuestionRequest {
    private String text;
    private String difference;
    private String theme;
    private String language;
    private String rightAnswer;
    private String fakeAnswer1;
    private String fakeAnswer2;
    private String fakeAnswer3;

    public Question questionFrom() {
        return Question.builder()
                .text(text)
                .difference(Difference.valueOf(difference))
                .language(Language.valueOf(language))
                .theme(theme)
                .build();
    }

    public Answer answerFrom() {
        return Answer.builder()
                .rightAnswer(rightAnswer)
                .fakeAnswer1(fakeAnswer1)
                .fakeAnswer2(fakeAnswer2)
                .fakeAnswer3(fakeAnswer3)
                .build();
    }
}
