import java.util.Scanner;
public class IT24103846Lab3Q3{

	public static void main (String[]args){

	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter the Rupee amount: ");
	int amount = input.nextInt();
	int count;
	count = amount/5000;
	amount = amount % 5000;
	System.out.println("5000 Notes - "+ count);
	count = amount / 1000;
	amount = amount % 1000;
	System.out.println("1000 Notes - "+ count);
	count = amount / 500;
	amount = amount % 500;	
	System.out.println("500 Notes - "+ count);
	count = amount / 100;
	amount = amount % 100;
	System.out.println("100 Notes - "+ count);
	count = amount / 50;
	amount = amount % 50;
	System.out.println("50 Notes - "+ count);
	count = amount / 20;
	amount = amount % 20;
	System.out.println("20 Notes - "+ count);
	count = amount / 10;
	amount = amount % 10;
	System.out.println("10 coins - "+ count);
	count = amount / 5;
	amount = amount % 5;
	System.out.println("05 coins - "+ count);
	count = amount / 2;
	amount = amount % 2;
	System.out.println("02 coins - "+ count);
	count = amount / 1;
	amount = amount % 1;
	System.out.println("01 coins - "+ count);

	}
}

	

	
	
	