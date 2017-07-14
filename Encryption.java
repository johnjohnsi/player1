package logic;

 class Encryption {
	public static String output1;
	public static void main( String [] args ) {
		userMethod( "java" ); 
		System.out.println( output1 ); 
		}
	public static void userMethod( String input1 ) {
		int num[] = new int[input1.length()];
		char ch1 = input1.charAt(input1.length()-1);
		int key = ch1 - 'a'+1;
		System.out.println( "Encryption of the given string : " );
		for( int i = 0 ; i<input1.length()-1 ; i++ ){
			char ch = input1.charAt( i );
			if( ch>='A' && ch<='Z' ){
				num[i] = (int)ch - 'A' + 1;
				num[i] -= key;
				if( num[i]<=0 ){
					num[i] += 26;
				}
				System.out.print( Character.toString( ( char )( num[i]+96 ) ).toUpperCase() );
			}
			if( ch>='a' && ch<='z' ){
				num[i] = (int)ch - 'a' + 1;
				num[i] -= key;
				if( num[i]<=0 ){
					num[i] += 26;
				}				
				System.out.print(  Character.toString( ( char )( num[i]+96 ) ) );
			}
		} 
		output1 = input1.substring( input1.length()-1 );
	}
 }

