package john;

import java.util.Scanner;

public class slar {

	public static void main(String[] args) {
		int arr[] =new int[50];
		Scanner n=new Scanner(System.in);
		System.out.println("number of array element is" );
		int num,s1=12345,s2=12342;
		num=n.nextInt();
		System.out.println("array elements" );
		for (int i=0;i<num;i++) {
 arr[i]=n.nextInt();
			if (arr[i]<s1) {
			
				s1=arr[i];
			} 
		
		
			if(s1!=arr[i])
				{
				if (arr[i]<s2) {
				}
				s2=arr[i];
				}
		}
		System.out.println("Second largest number is "+s2);
		n.close();
	}
}

