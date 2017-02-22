package com.tamingjava;

import org.apache.commons.lang3.StringUtils; 

public class Main 
{
    public static void main(String[] args) 
	{
	
		String str1 = "hey wonderful people";
		str1 = StringUtils.upperCase(str1);
		System.out.println(str1);
		Print.upperCaseStringConversion(args[0]);
    }
}
