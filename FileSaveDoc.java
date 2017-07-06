package guvi;

import java.util.Scanner;

public class FileSaveDoc {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=s.nextLine();
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)==('.')){
			System.out.println(str.substring(i+1));
		}
		}
		s.close();
	}
}
