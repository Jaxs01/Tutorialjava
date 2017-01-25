/**
* Created by Jacqueline on 16/12/2016....
* Hello world ...compile with javac
* create a package tamingjava
* add Print.print with only args[0] 
* change args ->  for(int i=0;i < args.length; i++)
*/
	
package com.tamingjava;

import org.apache.commons.lang3.StringUtils; 

public class Main 
{
    public static void main (String[] args) 
	{
		//for(int i = 0;i < args.length; i++)
        //Print.print (args[0]);
		String str1 = "hey wonderful people";
		str1 = StringUtils.upperCase(str1);
		System.out.println(str1);
		Print.upperCaseStringConversion(args[0]);
    }
}
