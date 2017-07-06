package guvi;
import java.util.Scanner;

public class ExitQ {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		if(ch=='Q'||ch=='q'){
			System.out.println("The prgm is exit");
		}
		else{
			System.out.println("The prgm is continue");
			s.close();
		}
	}
}
