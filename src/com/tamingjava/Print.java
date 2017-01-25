/*
* Step6 Add a new Print.java class in com.tamingjava.print package
* Add a static method in this class that accepts a String param and prints it
* Step7 Call Print.java class from Main.java to print hello Jaxs, how are you today
* add \n for new line \t for tabulator and another line printed
* Step 14 Print in UPPER CASE
*/
package com.tamingjava;

import org.apache.commons.lang3.StringUtils;

 
public class Print 
{
    //public static void print (String printable) 
	//{
    //  		System.out.println("\" Hello " + printable + ",\n \t how are you today?\"");
	//		System.out.println("*               Have a wonderful day           *");
    //}
	
	public static void upperCaseStringConversion(String name)
	{
		
		System.out.println(stringConversionAndReturnValue(name));
		
	}
	
	
	private static String stringConversionAndReturnValue (String name) 
	{
		name = StringUtils.upperCase(name);
		String message = (" and  " + name + " how are you today? "+ name + " ....did you smile today?");
		return message;
	}
}	
