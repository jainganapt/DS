import java.util.regex.Pattern;

public class SplitString {

	public static void main(String arg[]) {
		String a = "Monthly Rental,100.00|3G Rental,0.00|Pro-Rated I_LIVE8_ENG_RENT,16.00 | I_LIVE8_ENG_RENT,30.00|PRBT Service Rental,50.00";

		String[] out = a.split(Pattern.quote("|"));

		for (String a1 : out) {
			String[] out2 = a1.split(Pattern.quote(","));
			for (String a2 : out2) {
				System.out.println("out"+a2);
			}
		}
	}
}
