package library.app;

public class LibraryApp {

	public static void main(String[] args) {

		final String appName = "Library v1.0 - SNAPSHOT";
		LibraryControl lib = new LibraryControl();
		
		System.out.println(appName);
		lib.controlLoop();	
	}
}
