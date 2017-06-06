package john;

import java.util.Scanner;

public class primerange {

	public static void main(String[] args) {
		int i,num,num1,f,j;
		System.out.println("number ");
		Scanner n=new Scanner(System.in);
		num=n.nextInt();
		System.out.println("number2 ");
		num1=n.nextInt();
		for(i=num;i<=num1;i++)
		{
			f=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(i);
			}
			
		}
		n.close();
	}

}
