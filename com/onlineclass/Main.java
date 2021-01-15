package com.onlineclass;

import java.util.*;

public class Main {

	static String userName;
	static String pwd;

	public static void main(String[] args) {
		
		int i = 1;  
	    while (i <= 3) {
	    	   
	    	System.out.println("Welcome to Login page ");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter User Name : ");
			Main.userName = input.nextLine();
			System.out.print("Enter Password  : ");
			Main.pwd = input.nextLine();
		
		Condition adm = new Condition();
		if ( (Main.userName.equalsIgnoreCase(adm.AdminUser)) && (Main.pwd.equals(adm.AdminPwd))) {
			System.out.println(" Welcome " + userName + " To  Administrator Session ");
			break;
		

		} else if ( (Main.userName.equalsIgnoreCase(adm.webUser)) && (Main.pwd.equals(adm.webPwd))) {
			System.out.println(" Welcome " + userName + " To  Webmaster Session ");
			break;

		} 
		 else if ( i==3) {
			 System.out.println("you a execeed Maxmum login attempt  ");
			 break;
			} 
		 else {
			System.out.println(" wrong user / Password  ");
		      i++;
		      System.out.println(i+ "Chance to enteright User/Password ");
		     

		}
		}

	}

	
}