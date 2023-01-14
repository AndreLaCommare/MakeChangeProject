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

		if (itemPrice > tender) {
			System.out.println("Invalid Purchase: Not Enough Funds");
			return;
		}

		int itemDollarsOnly = (int) itemPrice;
		double itemCentsOnly = itemPrice - itemDollarsOnly;
		// System.out.println("here");
		// System.out.println(itemCentsOnly);
		// Coins(itemCentsOnly);
		int tenderDollarsOnly = (int) tender;
		int changeInDollars = tenderDollarsOnly - itemDollarsOnly;

		if (changeInDollars % 20 >= 0 && (int) (changeInDollars / 20) != 0) {
			if (changeInDollars <= 21) {
				changeInDollars -= 1;
			}
			int numOfTwenties = (int) (changeInDollars / 20);
			if (numOfTwenties > 0) {
				System.out.println("You are getting " + numOfTwenties + " twenty dollar bill(s) back.");
			}
			changeInDollars = (int) (changeInDollars %= 20);
		}
		if (changeInDollars % 10 >= 0 && (int) (changeInDollars / 10) != 0) {
			if (changeInDollars <= 11) {
				changeInDollars -= 1;
			}
			int numOfTens = (int) (changeInDollars / 10);
			if (numOfTens > 0) {
				System.out.println("You are getting " + numOfTens + " ten dollar bill(s) back.");
			}
			changeInDollars = (int) (changeInDollars %= 10);
		}
		if (changeInDollars % 5 >= 0 && (int) (changeInDollars / 5) != 0) {
			if (changeInDollars <= 6) {
				changeInDollars -= 1;
			}
			int numOfFives = (int) (changeInDollars / 5);
			if (numOfFives > 0) {
				System.out.println("You are getting " + numOfFives + " five dollar bill(s) back.");
			}
			changeInDollars = (int) (changeInDollars %= 5);
		}
		// System.out.println(changeInDollars);
		if ((changeInDollars / 1) >= 1) {
			if (changeInDollars <= 2) {
				changeInDollars -= 1;
			}
			int numOfOnes = (int) (changeInDollars / 1);
			if (numOfOnes > 0) {
				System.out.println("You are getting " + numOfOnes + " one dollar bill(s) back.");
			}
		}

		Coins(itemCentsOnly);

		// double totalReturn = tender - itemPrice;
		// System.out.println(totalReturn);

	}

	public static void Coins(double change) {
		change = 1.00 - change;
		// System.out.println(change);
		change = (change + .005) * 100;

		if (change % 25 >= 0 && (int) (change / 25) != 0) {
			int numOfQuarters = (int) (change / 25);
			System.out.println("You are getting " + numOfQuarters + " quarter(s) back.");
			change = (int) (change %= 25);
			// System.out.println("inside quarters");
			// System.out.println(change);
		}
		if (change % 10 >= 0 && (int) (change / 10) != 0) {
			int numOfDimes = (int) (change / 10);
			System.out.println("You are getting " + numOfDimes + " dime(s) back.");
			change = (int) (change %= 10);
			// System.out.println("inside dimes");
			// System.out.println(change);
		}
		if (change % 5 >= 0 && (int) (change / 5) != 0) {
			int numOfNickels = (int) (change / 5);
			System.out.println("You are getting " + numOfNickels + " nickel(s) back.");
			change = (int) (change %= 5);
			// System.out.println("inside nickels");
			// System.out.println(change);
		}
		// System.out.println((int)change);
		if ((int) (change / 1) != 0) {
			int numOfPennies = (int) (change / 1);
			System.out.println("You are getting " + numOfPennies + " penny(ies) back.");
			// System.out.println("inside pennies");
			// System.out.println(change);
		}
		// System.out.println((int)change);

	}

}
