package john;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		int num,temp=0,r=0;
		System.out.println("Enter the digit");
		Scanner n=new Scanner(System.in);
		num=n.nextInt();
		while(num!=0)
		{
			r=num%10;
			temp=temp*10+r;
			num=num/10;

		}
System.out.println("After reverse "+temp);
		
n.close();
	}

}
