package ru.klasix12.java_questions.service;

import org.springframework.stereotype.Service;
import ru.klasix12.java_questions.model.Answer;
import ru.klasix12.java_questions.repository.AnswerRepository;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public long saveAnswer(Answer answer) {
        return answerRepository.save(answer).getId();
    }
}
