package john;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		String str,str2="sunday";
		System.out.println("Enter the day");
		Scanner s=new Scanner(System.in);
		str=s.next();
		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("False");
		}
		else
		{
		System.out.println("True");
		}
		s.close();
	}

}
