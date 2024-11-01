import java.util.Scanner;
public class IT24103846Lab3Q2 {
	public static void main (String[]args){

	Scanner input = new Scanner (System.in);
	
	System.out.print ("Enter the monthly salary: ");
	double salary = input.nextDouble();
	System.out.print ("Enter the number of OT hours: ");
	double othours = input.nextDouble();
	System.out.print ("Enter the OT hourly rate: ");
	double otrate = input.nextDouble();
	
	//total salary with OT
	double totalsalary = salary + (othours * otrate);

	System.out.print ("The total salary including OT is: " + totalsalary);
	}
}