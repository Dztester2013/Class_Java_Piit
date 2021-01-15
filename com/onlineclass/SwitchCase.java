package com.onlineclass;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		
		System.out.println("***----Menu----*** ");
		System.out.println("1-calcul moyen de Maths");
		System.out.println("2-calcul moyen de Science");
		System.out.println("3-calcul moyen de General Moyenne ");
		System.out.println("4-Quit ");
		System.out.print("Enter your Choice from menu : ");

		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();

		switch (menu) {
		case 1:
			math();

			break;
		case 2:
			 science();		
break;
		case 3:
			moygeneral();
			
break;
		case 4:
			System.out.println("4-Quit ");

		}
	}

	public static void math() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter Grade of Algerbra");
		double algerbra = input.nextInt();
		System.out.println("enter Grade of Geometry");
		double geometry = input.nextInt();
		double mathMoy = ((algerbra + geometry) / 2) * 3;
		System.out.println("Your Math average grade is : " + mathMoy + "/60");
	}

	
	public static void science() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter Grade of Biology");
		double biology = input.nextInt();
		System.out.println("enter Grade of Physics");
		double physics = input.nextInt();
		double scienceMoy = ((biology + physics) / 2) * 5;
		System.out.println("Your Math average grade is : " + scienceMoy + "/100");
	}
	
	public static void moygeneral() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter Grade of Algerbra");
		double algerbra = input.nextInt();
		System.out.println("enter Grade of Geometry");
		double geometry = input.nextInt();
		System.out.println("enter Grade of Biology");
		double biology = input.nextInt();
		System.out.println("enter Grade of Physics");
		double physics = input.nextInt();
		double mathMoy = ((algerbra + geometry) / 2) * 3;
		double scienceMoy = ((biology + physics) / 2) * 5;
		double moygeneral =(mathMoy+scienceMoy);
		System.out.println("Your Math average grade is : " + mathMoy + "/60");
		System.out.println("Your Math average grade is : " + scienceMoy + "/100");
		System.out.println("Your Math average grade is : " + moygeneral + "/160");

	
	
	}

}
