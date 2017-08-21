package guvi;
import java.util.*;
public class CuboidSurfaceAndVolume {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int breadth = s.nextInt();
		int height = s.nextInt();
		System.out.println( "Volume of cuboid " + ":" + " " + length * breadth * height );
		System.out.println( "Total surface of cuboid  " + ":"+ " " + ( 2 * ( length * breadth ) + 2 * ( breadth * height ) + 2 * ( length * height ) ) );
		s.close();
	}
}
