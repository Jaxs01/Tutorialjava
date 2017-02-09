package com.tamingjava;

import org.apache.commons.lang3.StringUtils;

 
public class Print 
{
   
	
	public static void upperCaseStringConversion(String name)
	{
		
		System.out.println(stringConversionAndReturnValue(name));
		
	}
	
	
	public static String stringConversionAndReturnValue (String name) 
	{
			name = StringUtils.upperCase(name);
			String message = ( ":-)"+ name + " is awesome ");
			return message;
	}
}	
