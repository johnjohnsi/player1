package guvi;

import java.util.Scanner;

public class Qexit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='z'){
			count++;
		}
		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
			count1++;
		}
		if(str.charAt(i)>=0 && str.charAt(i)<=47 || str.charAt(i)>=58 &&str.charAt(i)<=64 || str.charAt(i)>=91 && str.charAt(i)<=96 || str.charAt(i)>=123 && str.charAt(i)<=127){
			count2++;
		}
		}
		System.out.println("Count of alphabet : "+count);
		System.out.println("Count of numbers : "+count1);
		System.out.println("Count of Special character : "+count2);
		s.close();
	}

}
