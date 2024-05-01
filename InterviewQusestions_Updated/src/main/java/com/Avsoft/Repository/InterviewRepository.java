package com.Avsoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Avsoft.Model.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {
	
	
}
