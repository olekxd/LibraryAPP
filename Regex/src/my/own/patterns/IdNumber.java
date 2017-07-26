package my.own.patterns;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdNumber {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// With this application you can proof, if insert number is correct to pattern
		Pattern idPattern = Pattern.compile("[A-Z]{3}[0-9]{6}");
		boolean isCorrect = false;
		while(isCorrect != true) {
			System.out.println("Write your idnumber (Format: AAA123456)");
			Matcher match = idPattern.matcher(userText());

			if((isCorrect = match.matches()) == true) {
				System.out.println("Your id is correct");
			} else {
				System.out.println("Sorry wrong id");
			}
		}

	}

	public static String userText() {
		return sc.nextLine();
	}

}
