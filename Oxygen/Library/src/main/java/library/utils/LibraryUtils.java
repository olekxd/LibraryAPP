package library.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import library.data.Book;
import library.data.Library;
import library.data.LibraryUser;
import library.data.Magazine;
import library.data.Publication;
import library.data.User;

public class LibraryUtils {

	public static void printBooks(Library lib) {
		long countBooks = lib.getPublications().values().stream().filter(Book.class::isInstance)
					.sorted(new Library.AlphabeticalComparator()).peek(System.out::println).count();
	
		if(countBooks == 0) 
			System.out.println("In library aren't any books");
	}
	
	
	public static void printMagazines(Library lib) {
		long countMagazines = lib.getPublications().values().stream().filter(Magazine.class::isInstance)
				.sorted(new Library.AlphabeticalComparator()).peek(System.out::println).count();
		
		if(countMagazines == 0)
			System.out.println("In library aren't any magazines");
	}
	
	
	public static void printUsers(Library lib) {
		lib.getUsers().values().stream()
					  .sorted((a, b) -> a.getLastName().compareTo(b.getLastName()))
						.forEach(System.out::println);
	}
	
	
	public static void printBooksOld(Library lib) {
		List<Publication> publications = new ArrayList<>();
		publications.addAll(lib.getPublications().values());
//		Collection<Publication> publications = lib.getPublications().values(); 
//		Arrays.sort(publications, new Library.AlphabeticalComparator());
		Collections.sort(publications, new Library.AlphabeticalComparator());
		int countBooks = 0;
		for(Publication p: publications){
			if(p instanceof Book){
				System.out.println(p);
				countBooks++;
			}
		}
		
		if(countBooks == 0)
		System.out.println("None avaible books in library");
	}
	
	
	public static void printMagazinesOld(Library lib) {
		List<Publication> publications = new ArrayList<>();
		publications.addAll(lib.getPublications().values());
//		Collection<Publication> publications = lib.getPublications().values();
//		Arrays.sort(publications, new Library.AlphabeticalComparator());
		Collections.sort(publications, new Library.AlphabeticalComparator());
		int countMagazines = 0;
		for(Publication p : publications) {
			if(p instanceof Magazine){
				System.out.println(p);
				countMagazines++;
			}
		}
		if(countMagazines == 0) 
			System.out.println("None avaible magazines in library");
	}
	
	public static void printUsersOld(Library lib) {
		List<LibraryUser> users = new ArrayList<>();
		users.addAll(lib.getUsers().values());
		//Using normal anonymous classes
		
		Collections.sort(users, new Comparator<LibraryUser>(){

			@Override
			public int compare(LibraryUser o1, LibraryUser o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}});
	
		//Using instead of anonymous class a lambda expression
//		Collections.sort(users, (u1, u2) -> u1.getLastName().compareTo(u2.getLastName()));
//		Collection<LibraryUser> users = lib.getUsers().values();
		for(LibraryUser u : users){
			System.out.println(u);
		}
	}
	
	//Second method written with help from book Bareczko 
	public void printBooksSecond(Library lib) {
		Collection<Publication> publications = lib.getPublications().values();

		int bookCounter = 0;
		for(Publication p : publications){
			if(p.getClass().equals(Book.class)){
				System.out.println(p);
				bookCounter++;
			}
		}
		if(bookCounter == 0)
			System.out.println("Empty");
	}
	

}
