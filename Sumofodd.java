package guvi;

public class Sumofodd {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=15;i++){
			sum+=i;
		}
		System.out.println("Sum of numbers 1 to 15 : "+sum);
		int sum1=0;
		for(int i=15;i<=45;i++){
			if(i%2!=0){
				sum1+=i;
			}
		}
		System.out.println("Sum of odd numbers 15 to 45 : "+sum1);
	}

}
