package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the price of your desired item:");
		double itemPrice = kb.nextDouble();
		System.out.println("Please enter the amount you have to pay:");
		double tender = kb.nextDouble();

		double change = tender - itemPrice;
		change = Math.round(change * 100);
		change /= 100;

		int changeDollarsOnly = (int) change;
		

		double cents = change - changeDollarsOnly;
		cents = Math.round(cents * 100);
		cents /= 100;
		
		if (itemPrice > tender) {
			System.out.println("Invalid Funds");
			return;
		}else if (itemPrice == tender) {
			System.out.println("You paid with exact change.");
			return;
		}
		
		

		dollars(changeDollarsOnly);

		coins(cents);

	}

	public static void coins(double cents) {
		int quarterCount = 0;
		while (cents >= .25) {

			quarterCount++;
			cents -= .25;

		}
		if (!(quarterCount == 0)) {
			System.out.println("You are getting " + quarterCount + " quarter(s) back.");
		}
		int dimeCount = 0;
		while (cents >= .1) {

			dimeCount++;
			cents -= .1;

		}
		if (!(dimeCount == 0)) {
			System.out.println("You are getting " + dimeCount + " dime(s) back.");
		}
		int nickelCount = 0;
		while (cents >= .05) {

			nickelCount++;
			cents -= .05;

		}
		if (!(nickelCount == 0)) {
			System.out.println("You are getting " + nickelCount + " nickel(s) back.");
		}

		int pennyCount = 0;
		while (cents > 0) { // rounding error when condition was cents >= .01;

			pennyCount++;
			cents -= .01;

		}
		if (!(pennyCount == 0)) {
			System.out.println("You are getting " + pennyCount + " penny(ies) back.");
		}

	}

	public static void dollars(double changeDollarsOnly) {
	
		int twentiesCount = 0;
		while (changeDollarsOnly >= 20) {

			twentiesCount++;
			changeDollarsOnly -= 20;

		}
		if (!(twentiesCount == 0)) {
			System.out.println("You are getting " + twentiesCount + " twenty(ies) back.");
		}
		
		
		int tensCount = 0;
		while (changeDollarsOnly >= 10) {

			tensCount++;
			changeDollarsOnly -= 10;

		}
		if (!(tensCount == 0)) {
			System.out.println("You are getting " + tensCount + " ten(s) back.");
		}
		
		int fivesCount = 0;
		while (changeDollarsOnly >= 5) {

			fivesCount++;
			changeDollarsOnly -= 5;

		}
		if (!(fivesCount == 0)) {
			System.out.println("You are getting " + fivesCount + " five(s) back.");
		}
		
		int onesCount = 0;
		while (changeDollarsOnly >= 1) {

			onesCount++;
			changeDollarsOnly -= 1;

		}
		if (!(onesCount == 0)) {
			System.out.println("You are getting " + onesCount + " one(s) back.");
		}
	}

}