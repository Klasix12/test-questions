package ru.klasix12.java_questions.controller;

import org.springframework.web.bind.annotation.*;
import ru.klasix12.java_questions.model.Difference;
import ru.klasix12.java_questions.model.Language;
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

    @PostMapping("/add")
    public long addQuestion(@ModelAttribute QuestionRequest questionRequest) {
        return questionService.addNewQuestion(questionRequest);
    }

    @GetMapping("/get")
    public List<Question> getQuestions() {
        return questionService.getQuestions();
    }

    @GetMapping("/get-by-language/{language}")
    public List<Question> getQuestionsByLanguage(@PathVariable("language") String language) {
        return questionService.getQuestionsByLanguage(Language.valueOf(language));
    }

    @GetMapping("/get-by-difference/{difference}")
    public List<Question> getQuestionsByDifference(@PathVariable("difference") String difference) {
        return questionService.getQuestionsByDifference(Difference.valueOf(difference));
    }
}
