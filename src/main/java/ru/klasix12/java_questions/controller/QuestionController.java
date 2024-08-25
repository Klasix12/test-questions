package ru.klasix12.java_questions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.klasix12.java_questions.model.Question;
import ru.klasix12.java_questions.service.QuestionService;

import java.util.List;

@RestController(value = "/api/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("add-question")
    public long addQuestion(@ModelAttribute Question question) {
        return questionService.save(question);
    }

    @GetMapping("get-questions")
    public List<Question> getQuestions() {
        return questionService.getQuestions();
    }
}
