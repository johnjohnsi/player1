package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Gretnumten {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The greatesh number among ten numbers : "+arr[arr.length-1]);
		s.close();
		
	}
}
