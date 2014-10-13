public class Plass{
	boolean ledig; 
	Spiller spiller; 

	Plass(){
		ledig = true; 
	}

	public boolean erLedig(){
		return ledig; 
	}

	public void plasserBrikke(Spiller s){
		ledig = false; 
		spiller = s; 
	}

	public String toString(){
		if(ledig){
			return ".";
		}
		return "" +spiller.hentNr();
	}
}
