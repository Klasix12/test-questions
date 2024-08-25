package ru.klasix12.java_questions.service;

import org.springframework.stereotype.Service;
import ru.klasix12.java_questions.model.Question;
import ru.klasix12.java_questions.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    public long save(Question question) {
        return questionRepository.save(question).getId();
    }
}
