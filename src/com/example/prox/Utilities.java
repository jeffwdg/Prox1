package com.example.prox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
	
	public boolean isValidEmail(String email){
		//boolean $valid = true;
		
		Pattern pattern;
	    Matcher matcher;
	    final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	    pattern = Pattern.compile(EMAIL_PATTERN);
	    matcher = pattern.matcher(email);
	    return matcher.matches();
		
	}
}
