
package com.hcl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepo;
	
	public Iterable <Feedback> GetAllFeedback(){
		return feedbackRepo.findAll();
	}
	
	public void saveFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
	}
	
	
}

