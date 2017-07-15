package guvi;

import java.util.Scanner;

public class FibSeries {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int n1=0;
		int n2=1;
		int temp;
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<num;i++){
			temp=n1+n2;
			System.out.println(temp);
			n1=n2;
			n2=temp;
		}
		s.close();

	}

}
