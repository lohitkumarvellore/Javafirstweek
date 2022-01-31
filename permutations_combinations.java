package firstweek;
import java.util.Scanner;

public class permutations_combinations {
	
	static int fact(int n)
	{
		int i, fact = 1;
		for(i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		return fact;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		// permutations
		int permutation = fact(n)/fact(n-r);
		System.out.println(permutation + "is the permutations number");
		
		// combinations
		
		int combination = fact(n)/(fact(r)*fact(n-r));
		System.out.println(combination + "is the combinations number");
		

	}
}
