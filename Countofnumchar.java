package guvi;
import java.util.Scanner;

public class Countofnumchar {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=s.nextLine();
		System.out.println("The numerical character in the given string : ");
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
			System.out.print(str.charAt(i)+" ");
		}
		}
		s.close();
	}
}
