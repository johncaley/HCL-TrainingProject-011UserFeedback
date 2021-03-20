package com.hcl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubmitFeedbackController {

	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("RESTgetAllFeedback")
	public @ResponseBody Iterable<Feedback> getAllFeedbacks(){
		return feedbackService.GetAllFeedback();
	}
	
	@PostMapping("RESTpostFeedback")
	public @ResponseBody String saveFeedback(Feedback feedback) {
		
		feedbackService.saveFeedback(feedback);
		
		return "<p>Thank you. Your feedback has been submitted</p>";
	}
}
