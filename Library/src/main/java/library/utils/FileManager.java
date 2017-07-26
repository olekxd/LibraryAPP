package library.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import library.data.Library;

public class FileManager {
	public static final String FILE_NAME = "Library.obj";
	
	public void writeLibraryToFile(Library lib) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));) {
			oos.writeObject(lib);
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + FILE_NAME);
		} catch (IOException e) {
			System.err.println("Error while saving data to file " + FILE_NAME);
			e.printStackTrace();
		}
	}
	
	public Library readLibraryFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		Library library = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));) {
			library = (Library) ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("Can't finde file to load " + FILE_NAME);
			throw e;
		} catch (IOException e) {
			System.err.println("ERROR, can't load file " + FILE_NAME);
			throw e;
		} catch (ClassNotFoundException e) {
			System.err.println("Wrong file format");
			throw e;
		}
		
		return library;
	}
	
	
	
	
}
