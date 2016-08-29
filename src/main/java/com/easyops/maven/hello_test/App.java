package com.easyops.maven.hello_test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print(returnInfo());
    }
    
    public static String returnInfo()
    {
    	String str1 = "Hello";
    	String str2 = "World";
    	#return str1+str2;
    }
    
}
