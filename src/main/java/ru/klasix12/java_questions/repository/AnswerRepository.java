package ru.klasix12.java_questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.klasix12.java_questions.model.Answer;
import ru.klasix12.java_questions.model.Question;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
