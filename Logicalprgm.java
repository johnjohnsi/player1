package logic;

public class Logicalprgm {
	public static int output1;
	public static void main( String [] args ) {
	userMethod( 1234 ); 
	System.out.println( output1 ); 
	}
	public static void userMethod( int input1 ) {
		int sum=0;
		int rem=0;
		while(input1>0){
			rem=input1%10;
			sum=(sum*10)+rem;
			input1/=10;
		}
		int s1=0,s2=0;
		while(sum>0){
			rem=sum%10;
			s1+=rem;
			s2+=s1;
			sum/=10;
		}
		output1=s2;	
	
	}
}


