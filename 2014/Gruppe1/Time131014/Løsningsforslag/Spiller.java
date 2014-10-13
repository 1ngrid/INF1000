public class Spiller{
	private String navn; 
	private String nr; 
	Spiller(String navn, String nr){
		this.navn = navn; 
		this.nr = nr; 
	}
	public String toString(){
		return nr; 
	}

	public String hentNavn(){
		return navn; 
	}
}
