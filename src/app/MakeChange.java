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
		
		int itemDollarsOnly = (int) itemPrice;
		double itemCentsOnly = itemPrice - itemDollarsOnly;
		Coins(itemCentsOnly);
		
		double totalReturn = tender - itemPrice;
		//System.out.println(totalReturn);
		
		
		
		

	}
	
	public static void Coins(double change) {
		change = 1.00 - change;
		change = (change + .005) * 100;
		
		if (change % 25 >= 0) {
			int numOfQuarters = (int)(change /25);
			System.out.println("You are getting " + numOfQuarters + " quarter(s) back.");
			change = (int)(change %= 25);
			System.out.println("inside quarters");
			System.out.println(change);
		}
		if (change % 10 >= 0) {
			int numOfDimes = (int)(change/10);
			System.out.println("You are getting " + numOfDimes + " dime(s) back.");
			change = (int)(change %= 10);
			System.out.println("inside dimes");
			System.out.println(change);
		}
		if (change % 5 >= 0) {
			int numOfNickels = (int)(change/5);
			System.out.println("You are getting " + numOfNickels + " nickel(s) back.");
			change = (int)(change %= 5);
			System.out.println("inside nickels");
			System.out.println(change);
		}
		if (change % 1 == 0) {
			int numOfPennies = (int)(change/1);
			System.out.println("You are getting " + numOfPennies + " penny(ies) back.");
			System.out.println("inside pennies");
			System.out.println(change);
		}
			
		
		System.out.println((int)change);
		
		
		
		
		
	}

}
