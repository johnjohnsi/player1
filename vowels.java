package john;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
	String str;
	int i;
	System.out.print("Enter the string");
	Scanner s=new Scanner(System.in);
	str=s.next();
	for(i=str.length()-1;i>=0;i--)
		{
		
		}
	String s3=str.replaceAll("[aeiouAEIOU]","*");
	System.out.println(s3);
	s.close();

	}

}
