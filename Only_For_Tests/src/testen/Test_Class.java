package testen;

public class Test_Class {

	public static void main(String[] args) {
		TClass[] tab = new TClass[5];

		tab[0] = new TClass("Hejddo", "Tejsso");
		tab[1] = new TClass("Cipa", "Zdzira");
		tab[2] = new TClass("Hejo", "Tej22o");
		tab[3] = new TClass("Cipa", "Z3333dzira");
		tab[4] = new TClass("Hejo", "Tejo");

		TClass[] temp = new TClass[5];
		for (int i = 0; i < tab.length; i++) {
			for (int j = i + 1; j < tab.length; j++) {
				if (!tab[i].equals(tab[j])) {
					 temp[i] = tab[i];
				} else {

				}
			}
		}



		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

	public char[] remove(char[] symbols, char c)
	{
	    for (int i = 0; i < symbols.length; i++)
	    {
	        if (symbols[i] == c)
	        {
	            char[] copy = new char[symbols.length-1];
	            System.arraycopy(symbols, 0, copy, 0, i);
	            System.arraycopy(symbols, i+1, copy, i, symbols.length-i-1);
	            return copy;
	        }
	    }
	    return symbols;
	}
	public static class TClass{

		private String name;
		private String surname;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public TClass(String name, String surname) {

			this.name = name;
			this.surname = surname;
		}
		@Override
		public String toString() {
			return "TClass [name=" + name + ", surname=" + surname + "]";
		}

	}

}

