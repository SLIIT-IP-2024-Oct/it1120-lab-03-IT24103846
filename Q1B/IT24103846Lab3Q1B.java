import java.util.Scanner;
public class IT24103846Lab3Q1B {
	public static void main (String[]args){

	Scanner input = new Scanner (System.in);
	
	System.out.print ("Enter the price of 1kg rice: ");	
	double pricePerKg = input.nextDouble();

	System.out.print ("Enter the number of kg you want to buy: ");
	double kilograms = input.nextDouble();
	//total price before discount
	double totalpriceBfrDsct = (pricePerKg * kilograms);
	//price after the discount
	double totalpriceAftrDsct = totalpriceBfrDsct - totalpriceBfrDsct * 0.1;
	

	System.out.print ("The total amount with 10% discount is: " + totalpriceAftrDsct) ;
	
	}
}