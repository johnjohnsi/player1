package guvi;
import java.util.*;
public class SleepTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Ennter the No. of students : " );
		int studentCount = s.nextInt();
		System.out.println( "Enter the No. of Friends You have : " );
		int friendsCount = s.nextInt();
		System.out.println( "Enter the Slepping State of Your Friends : " );
		String sleepingState = s.next();
		int count = 0;
		System.out.println("Enter the Position of your Friends : " );
		int positionOfFriends [] = new int[friendsCount];
		for( int i = 0 ; i < friendsCount ; i++ ) {
			positionOfFriends[i] = s.nextInt();
		}
		for( int i = 0 ; i < studentCount; i++ ) {
			for( int j = 0 ; j < positionOfFriends.length ; j++ ) {
			if(sleepingState.charAt(positionOfFriends[j]) == '1' ) {
				count++;
			}
			}
		}
		if( count / studentCount == friendsCount ) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		s.close();
	}
}
