package com.Avsoft.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Avsoft.Model.Interview;
import com.Avsoft.Repository.InterviewRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InterviewServiceImpl implements InterviewService {
	@Autowired
	private InterviewRepository interviewRepository;

	@Override
	public List<Interview> getAllInterviews() {
		return interviewRepository.findAll();
	}

	@Override
	public Interview getInterviewById(Long id) {
		Optional<Interview> optionalInterview = interviewRepository.findById(id);
		return optionalInterview.orElse(null);
	}

	@Override
	public Interview createInterview(Interview interview) {
		return interviewRepository.save(interview);
	}

	@Override
	public Interview updateInterview(Long id, Interview interview) {
		if (interviewRepository.existsById(id)) {
			interview.setId(id);
			return interviewRepository.save(interview);
		}
		return null;
	}

	@Override
	public void deleteInterview(Long id) {
		interviewRepository.deleteById(id);
	}
}
