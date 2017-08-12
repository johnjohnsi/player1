package guvi;
import java.util.*;
public class StringReplaceBetweenAnd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String splitInput[] = input.split(" ");
		String temp = "";
		for( int i = 0 ; i < splitInput.length ; i++ ) {
			if(splitInput[i].contains("and")) {
				temp = splitInput[i-1];
				splitInput[i-1] = splitInput[i+1];
				splitInput[i+1] = temp;
			}
		}
		for( int i = 0 ; i < splitInput.length ; i++ ) {
			System.out.print(splitInput[i] + " ");
		}
		s.close();
	}
}
