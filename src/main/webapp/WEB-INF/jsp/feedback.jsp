<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01  
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html;  
 charset=UTF-8"> 
<title>Feedback Form</title> 
</head> 
<body> 	
	<h1>Enter Feedback</h1>
	
	<form action="postFeedback">
		<p>User: <input type="text" name="username"></p>
		
		<p>Rating: <input type="radio" id="0" name="rating" value="0">0
		 <input type="radio" id="1" name="rating" value="1">1
		 <input type="radio" id="2" name="rating" value="2">2
		 <input type="radio" id="3" name="rating" value="3">3
		 <input type="radio" id="4" name="rating" value="4">4
		 <input type="radio" id="5" name="rating" value="5">5
		 <input type="radio" id="6" name="rating" value="6">6
		 <input type="radio" id="7" name="rating" value="7">7
		 <input type="radio" id="8" name="rating" value="8">8
		 <input type="radio" id="9" name="rating" value="9">9
		 <input type="radio" id="10" name="rating" value="10">10</p>
		
		<p>Comments: </p> 
		<textarea name="comments" id="comments" rows="5" style="width:500px;"></textarea><br/><br/>
		<input type="submit" style="width: 100px">
	</form>
</body> 
</html> 
