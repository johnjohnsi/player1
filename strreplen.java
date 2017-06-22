package guvi;

import java.util.Scanner;

public class strreplen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		int num=s.nextInt();
		for(int i=0;i<str.length()-1;i++){
		System.out.println(str.substring(0,num-1)+str.charAt(i+1));
		}
		s.close();
	}
}
