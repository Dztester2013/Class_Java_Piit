package com.onlineclass;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * write program print following messages 
"access successful" if user and password correct 
"wrong user/password " if user or password correct 

 * * 
 * 
 * */
class Day1 {
	public static void main(String[] args)  {
		
		int pin;
		String  user;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your User Name : ");
		input.nextLine();
		user = input.nextLine();
		System.out.println("Enter your USer PIN  : ");
		pin = input.nextInt();
		System.out.println();


Condition con=new Condition();
con.condition(pin, user);


	
}
	
		
}
