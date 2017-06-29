package guvi;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[2];
		int b[]=new int[2];
		int c[]=new int[2];
		int d[]=new int[2];
		for(int i=0;i<2;i++){
			a[i]=s.nextInt();
			b[i]=s.nextInt();
			c[i]=s.nextInt();
			d[i]=s.nextInt();
		}
		int x=0;
		int y=0;
		int z=0;
		int k=0;
		for(int i=0;i<2;i++){
			x+=a[i];
			y+=b[i];
			z+=c[i];
			k+=d[i];
		}
		if(y-x==z-k){
			System.out.println("Square");
		}
		else{
			System.out.println("Not Square");
		}
	}

}
