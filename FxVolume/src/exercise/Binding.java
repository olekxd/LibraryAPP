package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Binding {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);){

				IntegerProperty first = new SimpleIntegerProperty();
				IntegerProperty second = new SimpleIntegerProperty();
				System.out.println("Write a number");
				second.bind(first);

				first.set(sc.nextInt());
				sc.nextLine();
				System.out.println("First number " + second.get());

				System.out.println("Write second number");
				first.set(sc.nextInt());
				sc.nextLine();
				System.out.println("Second number " + second.get());

		} catch (InputMismatchException e) {
			System.out.println("Wrong Input");
		}



	}

}
