package firstweek;
import java.util.Scanner;

public class swapnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter Second number");
		int b = sc.nextInt();
		System.out.println("numbers before Swapping are "+a+","+b);
		int temp;
		//Swapping
		temp=a;
		a=b;
		b=temp;
		System.out.println("numbers after Swapping are "+a+","+b);
	}
}
