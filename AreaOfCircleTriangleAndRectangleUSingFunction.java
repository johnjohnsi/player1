package guvi;
public class AreaOfCircleTriangleAndRectangleUSingFunction {
	public static void main(String[] args) {
		Area a = new Area();
		a.circle( 3 );
		a.rectangle( 5 , 3 );
		a.triangle( 20 , 12 );
	}
}
class Area {
	void circle( int radius ) {
		System.out.println((22/7) * radius * radius );
	}
	void rectangle( int width , int height ) {
		System.out.println( width * height );
	}
	void triangle( int breadth , int height ) {
		System.out.println( breadth * height / 2);
	}
	
}
