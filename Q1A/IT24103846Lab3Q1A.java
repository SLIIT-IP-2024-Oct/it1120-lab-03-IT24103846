import java.util.Scanner;
public class IT24103846Lab3Q1A {
	public static void main (String[]args){

	Scanner input = new Scanner (System.in);
	
	System.out.print ("Enter the price of 1kg rice: ");	
	double pricePerKg = input.nextDouble();

	System.out.print ("Enter the number of kg you want to buy: ");
	double kilograms = input.nextDouble();
	double totalprice = pricePerKg * kilograms;

	System.out.print ("The total amount is: " + totalprice) ;
	
	}
}
