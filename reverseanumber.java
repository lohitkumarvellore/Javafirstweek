package firstweek;
import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		System.out.println("entered number is: "+num);
		while(num!=0)
		{
			int remainder = num%10;
			rev = rev*10 +remainder;
			num = num/10;
		}
		System.out.println("reverse of the given string is : "+rev);
	}

}
