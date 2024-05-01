package com.Avsoft.Controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;

import com.Avsoft.Model.Interview;
import com.Avsoft.Service.InterviewService;

import java.util.List;

@RestController
@RequestMapping("/interviews")
public class InterviewController {
	@Autowired
	private InterviewService interviewService;

	@GetMapping
	public List<Interview> getAllInterviews() {
		return interviewService.getAllInterviews();
	}

	@GetMapping("/{id}")
	public Interview getInterviewById(@PathVariable Long id) {
		return interviewService.getInterviewById(id);
	}

	@PostMapping
	public Interview createInterview(@RequestBody Interview interview) {
		return interviewService.createInterview(interview);
	}

	@PutMapping("/{id}")
	public Interview updateInterview(@PathVariable Long id, @RequestBody Interview interview) {
		return interviewService.updateInterview(id, interview);
	}

	@DeleteMapping("/{id}")
	public void deleteInterview(@PathVariable Long id) {
		interviewService.deleteInterview(id);
	}
}
