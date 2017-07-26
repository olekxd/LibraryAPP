package library.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import library.data.Book;
import library.data.LibraryUser;
import library.data.Magazine;

public class DataReader {

	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}

	public int getId() throws NumberFormatException {
		int neededId = 0;
		try {
			neededId = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("Wrong format, expected an intiger number");
		} finally {
			sc.nextLine();
		}
		return neededId;
	}

	public Book readAndCreateBook() throws InputMismatchException {
		System.out.print("Write title: ");
		String title = sc.nextLine();
		System.out.print("Write author: ");
		String author = sc.nextLine();
		System.out.print("Write year:");
		int year = 0;
		int pages = 0;
		try {
			year = sc.nextInt();			
			if(year < 1900 || year > 2020)
				throw new InputMismatchException();
			System.out.print("Write number of pages: ");
			pages = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}
		System.out.print("Write publisher: ");
		String publisher = sc.nextLine();
		System.out.print("Write ISBN number: ");
		String isbn = sc.nextLine();
		return new Book(title, author, year, pages, publisher, isbn);
	}

	public Magazine readAndCreateMagazine() throws InputMismatchException {
		System.out.print("Write title: ");
		String title = sc.nextLine();
		System.out.print("Write publisher: ");
		String publisher = sc.nextLine();
		System.out.print("Write language: ");
		String language = sc.nextLine();
		int year = 0;
		int month = 0;
		int day = 0;
		try {
			System.out.print("Write year:");
			year = sc.nextInt();
			sc.nextLine();
			System.out.print("Write month: ");
			month = sc.nextInt();
			sc.nextLine();
			System.out.print("Write day: ");
			day = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextInt();
			throw e;
		}
		return new Magazine(title, publisher, language, year, month, day);
	}
	
	public LibraryUser readAndCreateLibraryUser() {
		System.out.println("User name: ");
		String firstName = sc.nextLine();
		System.out.println("User surname: ");
		String lastName = sc.nextLine();
		System.out.println("User PESEL: ");
		String pesel = sc.nextLine();
		
		return new LibraryUser(firstName, lastName, pesel);
	}

}
