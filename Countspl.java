package guvi;
import java.util.Scanner;
public class Countspl {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>=0 && str.charAt(i)<=47 || str.charAt(i)>=58 && str.charAt(i)<=64 ||str.charAt(i)>=91 && str.charAt(i)<=96 ||str.charAt(i)>=123 && str.charAt(i)<=127){
			count++;
		}
		}
		System.out.println("count of special character in the given string : "+count);
		s.close();
	}

}
