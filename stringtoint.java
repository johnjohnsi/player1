package guvi;

import java.util.Scanner;

public class stringtoint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		int num=Integer.parseInt(str);
		System.out.println(num);
		s.close();

	}

}
