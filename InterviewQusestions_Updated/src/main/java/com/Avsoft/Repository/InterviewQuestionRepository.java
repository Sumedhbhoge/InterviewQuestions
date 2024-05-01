package com.Avsoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Avsoft.Model.InterviewQuestion;

@Repository
public interface InterviewQuestionRepository extends JpaRepository<InterviewQuestion, Long> {
}
