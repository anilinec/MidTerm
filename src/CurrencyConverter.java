import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");

		double amount, dollar, pound, code, euro, yen;

		Scanner sc = new Scanner(System.in);

		System.out.println("hi, Welcome to the Currency Converter!");

		System.out.println("which currency You want to Convert ? ");

		System.out.println("1:Pound \t2:Dollar \t3:Euro \n4:Yen ");
		code = sc.nextInt();

		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();

		// For amounts Conversion
		if (code == 1) {
			// For Pound Conversion

			dollar = amount * 1.26;
			System.out.println("Your " + amount + " pound is : " + df.format(dollar) + " Dollar");

			euro = amount * 1.10;
			System.out.println("Your " + amount + " pound is : " + df.format(euro) + " Euro");

			yen = amount * 140.93;
			System.out.println("Your " + amount + " pound is : " + df.format(yen) + " Yen");

		} else if (code == 2) {
			// For Dollar Conversion

			pound = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + df.format(pound) + " Pound");

			euro = amount * 0.87;
			System.out.println("Your " + amount + " Dollar is : " + df.format(euro) + " Euro");

			yen = amount * 111.087;
			System.out.println("Your " + amount + " Dollar is : " + df.format(yen) + " Yen");

		} else if (code == 3) {
			// For Euro Conversion

			dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + df.format(dollar) + " Dollar");

			pound = amount * 0.90;
			System.out.println("Your " + amount + " euro is : " + df.format(pound) + " Pound");

			yen = amount * 127.32;
			System.out.println("Your " + amount + " euro is : " + df.format(yen) + " Yen");

		} else if (code == 4) {

			// For Yen Conversion

			dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + df.format(dollar) + " Dollar");

			pound = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + df.format(pound) + " Pound");

			euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + df.format(euro) + " Euro");

		} else {
			System.out.println("Invalid input");
		}

		System.out.println("Thank you for choosing our Example Programs");
	}

}