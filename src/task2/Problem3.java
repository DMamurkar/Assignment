package task2;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner (System.in);
	System.out.println("Enter you String:");
	
	String name =scr.next();
	
	String str = name;
	
	String rev = "";
	
	int length = name.length();
	
	for (int i=length-1; i>=0; i--)
	{
		rev = rev+name.charAt(i);
	}
	if(str.equals(rev))
	{
		System.out.println(str+" is palindrome string ");
	}
	else
	{
		System.out.println(str+ " is not palindrome string");
	}

}
}

