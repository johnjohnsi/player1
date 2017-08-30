package guvi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DifferenceBetweenTwoDates {
	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		String startDate = s.nextLine();
		String endDate = s.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date d1 = null;
		Date d2 = null;
		d1 = format.parse(startDate);
		d2 = format.parse(endDate);
		long diff = d2.getTime() - d1.getTime();
		long diffSec = diff / 1000 % 60;
		long diffMin = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.print( diffDays + " Days, ");
		System.out.print( diffHours + " Hours, ");
		System.out.print( diffMin + " Minutes, ");
		System.out.print( diffSec + " Seconds, ");
		s.close();
	}
}
