package guvi;

import java.util.Scanner;

public class Countarrayran {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num=s.nextInt();
		System.out.println("Enter the elements of array");
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=s.nextInt();
		}
		int rem=0;
		int count[]=new int[20];
		for(int i=0;i<num;i++){
			while(arr[i]!=0){
				rem=arr[i]%10;
				count[rem]++;
				arr[i]/=10;
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(i+"occurs "+count[i]+" times");
		}
		s.close();
	}
}
