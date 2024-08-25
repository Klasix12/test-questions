package ru.klasix12.java_questions.controller;

import org.springframework.web.bind.annotation.*;
import ru.klasix12.java_questions.model.Question;
import ru.klasix12.java_questions.model.QuestionRequest;
import ru.klasix12.java_questions.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/add-question")
    public long addQuestion(@ModelAttribute QuestionRequest questionRequest) {
        return questionService.addNewQuestion(questionRequest);
    }

    @GetMapping("/get-questions")
    public List<Question> getQuestions() {
        return questionService.getQuestions();
    }
}
