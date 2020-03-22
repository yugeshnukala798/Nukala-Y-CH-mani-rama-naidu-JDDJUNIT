package com.epam.TDDJUNIT;

public class RemoveAinFirstTwoChars {

	public String remove(String str) {
		// TODO Auto-generated method stub
		String res = "";
		int len = str.length();
		if(len > 0 && str.charAt(0) != 'A')
			res += str.charAt(0);
		if(len > 1) {
			if(str.charAt(1) != 'A')
				res += str.substring(1);
			else
				res += str.substring(2);
		}
		return res;
	}

}
