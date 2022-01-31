package firstweek;

import java.util.Scanner;

public class factofnumber {

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
			System.out.println(fact(n));
		}

}
