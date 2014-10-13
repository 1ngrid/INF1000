public class Spiller{
	private String navn; 
	private int nr; 

	Spiller(String n, int spillernr){
		// Spiller(String navn, int nr){
		// this.navn = navn; 
		// this.nr = nr; 
		navn = n; 
		nr = spillernr; 
	}

	public String toString(){
		return navn + " " + nr; 
	}
	public int hentNr(){
		return nr; 
	}
}
