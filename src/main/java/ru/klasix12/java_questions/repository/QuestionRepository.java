package ru.klasix12.java_questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.klasix12.java_questions.model.Difference;
import ru.klasix12.java_questions.model.Language;
import ru.klasix12.java_questions.model.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    public List<Question> findAllByLanguage(Language language);
    public List<Question> findAllByDifference(Difference difference);
}
