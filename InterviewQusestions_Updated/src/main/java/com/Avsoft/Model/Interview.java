package com.Avsoft.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Interview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String dateOfInterview;
	private String companyName;
	private int yearsOfExperience;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "interview_id")
	private List<InterviewQuestion> interviewQuestions;

	// Getters and setters
	// ...

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(String dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public List<InterviewQuestion> getInterviewQuestions() {
		return interviewQuestions;
	}

	public void setInterviewQuestions(List<InterviewQuestion> interviewQuestions) {
		this.interviewQuestions = interviewQuestions;
	}

}
