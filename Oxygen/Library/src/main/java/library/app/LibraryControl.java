package library.app;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import library.data.Book;
import library.data.Library;
import library.data.LibraryUser;
import library.data.Magazine;
import library.utils.DataReader;
import library.utils.FileManager;
import library.utils.LibraryUtils;

public class LibraryControl {
	//bliblioteka przechowujaca ksiazki
	private Library library;
	//zmienne do komunikacji z uzytkownikiem
	private DataReader dataReader;
	private FileManager fileManager;

	public LibraryControl() {
		dataReader = new DataReader();
		fileManager = new FileManager();
		try {
			library = fileManager.readLibraryFromFile();
			System.out.println("File loaded from file");
		}catch (ClassNotFoundException | IOException e) {
			library = new Library();
			System.out.println("New library created");
		}
	}

	public void controlLoop() {
		Option option = null;
		while (option != Option.EXIT) {
			try {
				printOptions();
				option = Option.createFromInt(dataReader.getId());
				switch (option) {
				case ADD_BOOK:
					addBook();
					break;
				case ADD_MAGAZINE:
					addMagazine();
					break;
				case PRINT_BOOKS:
					printBooks();
					break;
				case PRINT_MAGAZINES:
					printMagazines();
					break;
				case ADD_USER:
					addUser();
					break;
				case PRINT_USERS:
					printUsers();
					break;
				case EXIT:
					System.out.println("Bye, Bye");
					exit();
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong records, publication can't be added");
			} catch (NumberFormatException | NoSuchElementException e) {
				System.out.println("Choosed option do not exist, try once more");
			}
		}
		dataReader.close();
	}

	private void printOptions() {
		for (Option o : Option.values()) {
			System.out.println(o);
		}
	}

	//PROTOTYPE remove publication
	
	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}
	
	private void addUser() {
		LibraryUser user = dataReader.readAndCreateLibraryUser();
		library.addUser(user);
	}

	private void printBooks() {
		LibraryUtils.printBooks(library);
	}

	private void printMagazines() {
		LibraryUtils.printMagazines(library);
	}
	
	private void printUsers() {
		LibraryUtils.printUsers(library);
	}
	
	private void exit() {
		fileManager.writeLibraryToFile(library);
	}
	private enum Option {
		EXIT(0, "To exit from app"),
		ADD_BOOK(1, "To add Book"),
		ADD_MAGAZINE(2, "To add magazine"),
		PRINT_BOOKS(3, "To print all books"),
		PRINT_MAGAZINES(4, "To print all magazines"),
		ADD_USER(5, "Add a new member"),
		PRINT_USERS(6, "Print all users");

		private String description;
		private int number;
		
		private Option(int number, String description) {
			this.description = description;
			this.number = number;
		}
		@Override
		public String toString() {
			return number +" - " + description;
		}
		
		public static Option createFromInt(int option) throws NoSuchElementException {
			Option result = null;
			try {
				result = Option.values()[option];
			} catch (ArrayIndexOutOfBoundsException ex) {
					throw new NoSuchElementException("This option is not available");
			}
			return result;
		}
	}

}
