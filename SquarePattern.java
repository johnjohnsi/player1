package guvi;
import java.util.Scanner;
public class SquarePattern {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		for(int i=0;i<1;i++){
		for(int j=0;j<num;j++){
			System.out.print(" *");
		}
		System.out.print("\n");
		}
		for(int j=1;j<num-1;j++){
			for(int i=0;i<1;i++){
				System.out.print(" *");
			}
			for(int k=1;k<num-1;k++){
				System.out.print("  ");
			}
			for(int i=0;i<1;i++){
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for(int i=0;i<1;i++){
			for(int j=0;j<num;j++){
				System.out.print(" *");
			}
		}
	}

}
