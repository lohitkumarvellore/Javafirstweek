package firstweek;
import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			int temp = num*i;
			System.out.println(num+"*"+i+"="+temp);
		}
	}
}
