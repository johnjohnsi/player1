package guvi;

import java.util.Scanner;

public class Swapthree {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the strings");
		String str=s.nextLine();
		int count=1;
		while(!str.contains("end")){
			str=s.nextLine();
			count++;
		}
		System.out.println("The number of lines in tha pragraph is : "+count);
		s.close();
	}
}
