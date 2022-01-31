package firstweek;
import java.util.Scanner;

public class compoundinterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount: ");
		int p = sc.nextInt();
		System.out.println("enter the annual interest rate: ");
		int r = sc.nextInt();
		System.out.println("enter the time");
		int t = sc.nextInt();
		System.out.println("enter the number of times the interest calculated");
		int n = sc.nextInt();
		
		int temp = p*(1+(r/n));
		int CI = (int) (Math.pow(temp, n*t) - p);
		System.out.println("Compound intrest is:" + CI);
	}

}
