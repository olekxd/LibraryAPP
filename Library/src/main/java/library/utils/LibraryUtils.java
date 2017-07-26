package library.utils;

import java.util.Collection;

import library.data.Book;
import library.data.Library;
import library.data.Magazine;
import library.data.Publication;

public class LibraryUtils {

	public static void printBooks(Library lib) {
		Collection<Publication> publications = lib.getPublications().values(); 
//		Arrays.sort(publications, new Library.AlphabeticalComparator());
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
	
	public static void printMagazines(Library lib) {
		Collection<Publication> publications = lib.getPublications().values();
//		Arrays.sort(publications, new Library.AlphabeticalComparator());
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
