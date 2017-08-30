package guvi;
import java.util.*;
public class SwapEvenOddCharacterInString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		StringBuilder output = new StringBuilder();
		 
		char[] characters = input.toCharArray();
		 
		for (int i = 0; i < characters.length; i++)
		{
		  if (i % 2 == 0)
		  {
		      output.append(characters[i + 1]);
		      output.append(characters[i]);
		  }
		}
		System.out.println( output );
		s.close();
	}
}
