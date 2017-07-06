package guvi;
import java.util.Scanner;

public class Countofnumchar {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=s.nextLine();
		int count=0;
		System.out.println("The numerical character count in the given string : ");
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>='0' && str.charAt(i)<='9'){
			count++;
		}
		}
		System.out.println(count);
		s.close();
	}
}
