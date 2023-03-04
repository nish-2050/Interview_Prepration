//Ques-2 : Sum of two numbers
import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Num-1: ");
		int num_1 = sc.nextInt();
		System.out.println("Please enter Num-2: ");
		int num_2 = sc.nextInt();
		
		int sum = num_1 + num_2;
		
		System.out.println("Sum of both number is: " + sum);
		sc.close();

	}

}
