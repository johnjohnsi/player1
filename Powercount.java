package guvi;

public class Powercount {
	public static int output1;
	public static void main( String [] args ) {
	userMethod( 1234 ); 
	System.out.println( output1 ); 
	}
	public static void userMethod( int input1 ) {
		int num=input1;
		int count=0;
		while(num!=0){
			count++;
			num/=10;
		}
		int sum=0;
		while(input1!=0){
			int rem=1;
			int re=input1%10;
			for(int i=0;i<count;i++){
				rem*=re;
			}
			sum+=rem;
			input1/=10;
		}
		output1=sum;
	}


}
