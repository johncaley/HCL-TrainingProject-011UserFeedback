package com.hcl.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FeedbackController {

	@RequestMapping(value="feedback")
	public String home() {		
		return "feedback";
	}
	
	@RequestMapping(value="postFeedback")
	public String getUserInfo(@RequestParam String username, String rating, String comments, HttpSession session) {
		
		Feedback feedback = new Feedback();
		
		feedback.setUser(username);
		feedback.setRating(rating);
		feedback.setComments(comments);
		
		session.setAttribute("Feedback", feedback);
		
		return "RESTpostFeedback";
	}

	
	
}
