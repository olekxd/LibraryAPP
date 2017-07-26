//package library.app;
//
//import java.util.NoSuchElementException;
//
//public enum Option {
//
//	EXIT(0, "To exit from app"),
//	ADD_BOOK(1, "To add Book"),
//	ADD_MAGAZINE(2, "To add magazine"),
//	PRINT_BOOKS(3, "To print all books"),
//	PRINT_MAGAZINES(4, "To print all magazines");
//
//	private String description;
//	private int number;
//	
//	private Option(int number, String description) {
//		this.description = description;
//		this.number = number;
//	}
//	
//	public String getDescription() {
//		return description;
//	}
//	
//	public int getNumber() {
//		return number;
//	}
//	
//	@Override
//	public String toString() {
//		return number +" - " + description;
//	}
//	
//	public static Option createFromInt(int option) throws NoSuchElementException {
//		Option result = null;
//		try {
//			result = Option.values()[option];
//		} catch (ArrayIndexOutOfBoundsException ex) {
//				throw new NoSuchElementException("This option is not available");
//		}
//		return result;
//	
//	}
//}
