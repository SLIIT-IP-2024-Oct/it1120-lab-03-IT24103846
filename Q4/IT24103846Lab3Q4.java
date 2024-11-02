import java.util.Scanner;
public class IT24103846Lab3Q4 {
	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enetr the five- digit number: ");
	int num = input.nextInt();

	int digit1 = num / 10000;
	int digit2 = (num / 1000) % 10;
	int digit3 = (num / 100) % 10;
	int digit4 = (num / 10) % 10;
	int digit5 = num % 10;

	System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
	}
}
	