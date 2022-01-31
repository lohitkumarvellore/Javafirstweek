package firstweek;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		while(power != 0)
		{
			result = result * base;
			--base;
		}
		System.out.println(result);

	}

}
