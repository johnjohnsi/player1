package john;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		int num,i,mul;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number");
		num=n.nextInt();
		for(i=1;i<10;i++)
		{
			 mul=i*num;
			System.out.println(i+"*"+num+"="+mul);
		}
		n.close();

	}

}
