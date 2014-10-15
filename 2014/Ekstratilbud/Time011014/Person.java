public class Person{
	private String navn; 
	private int alder; 

	public void giNavn(String n) {
		navn = n; 
	}

	public void giAlder(int a) {
		alder = a; 
	}
	
	public String hentNavn() {
		return navn; 
	}

	public int hentAlder() {
		return alder; 
	}
}
