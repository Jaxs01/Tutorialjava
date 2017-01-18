/**
* Created by Jacqueline on 16/12/2016....
* Hello world ...compile with javac
* create a package tamingjava
* add Print.print with only args[0]
* change args ->  for(int i=0;i < args.length; i++)
*/
	
package com.tamingjava;
 
public class Main 
{
    public static void main (String[] args) 
	{
		for(int i = 0;i < args.length; i++)
        Print.print (args[i]);
    }
}
