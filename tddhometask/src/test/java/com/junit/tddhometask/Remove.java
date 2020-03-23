package com.junit.tddhometask;

public class Remove {
	String result="";

	public String removechar(String input) {
		String result="";
        char a = input.charAt(0);
		char a1 = input.charAt(1);
		if(a == 'A' && a1 == 'A') {
		    	result = input.substring(2);
			//result = input.replace("A", "");
		} else if(a == 'A') {
			result = input.substring(1);
		} else if(a1 == 'A') {
			result = input.substring(0,1) + "" + input.substring(1 + 1);
		} else {
			result = input;
		}
		return result;
	}
}
