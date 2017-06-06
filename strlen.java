package john;

import java.util.Scanner;

public class strlen {

	public static void main(String[] args) {
	String str;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	str=s.next();
	System.out.println("string length is "+str.length());
	s.close();
	}

}
