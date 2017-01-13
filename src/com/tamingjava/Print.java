//Step6: Add a new Print.java class in com.tamingjava.print package. 
//Add a static method in this class that accepts a String param and prints it.

package com.tamingjava;

/**
 * Created by Jaxs on 12/01/2017....
 */
 
public class Print 
{
    public static void main (String [] args) 
	{
        System.out.println("To have a fabulous fantastic Day...Please enter your name: ");
		String name = System.console().readLine();
		System.out.println("\"Hello " + name + ",have a fabulous fantastic day\"");
    }
}	