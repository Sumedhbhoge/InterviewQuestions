package com.Avsoft.Service;

import java.util.List;

import com.Avsoft.Model.Interview;

public interface InterviewService {
	List<Interview> getAllInterviews();

	Interview getInterviewById(Long id);

	Interview createInterview(Interview interview);

	Interview updateInterview(Long id, Interview interview);

	void deleteInterview(Long id);
}
