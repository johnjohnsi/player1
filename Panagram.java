package guvi;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
			count++;
		}
		}
		if(count==26){
			System.out.println("The given string is panagram");
		}
		else{
			System.out.println("The given string is not panagram");
		}
		s.close();
	}

}
