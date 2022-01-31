package firstweek;
import java.util.Scanner;
public class sumofxterms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=x;i++)
		{
			sum = sum +(3*i+2);
			if(sum%4 != 0)
			{
				System.out.println(sum);
			}
		}
	}
}
