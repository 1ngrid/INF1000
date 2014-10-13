public class Plass{
	private Spiller spiller; 
	private boolean ledig; 

	Plass(){
		ledig = true; 
	}

	public void settBrikke(Spiller s){
		spiller = s; 
		ledig = false; 
	}

	public boolean erLedig(){
		return ledig; 
	}

	public String toString(){

		/* Start med denne:		return spiller.toString(); */

		if (spiller == null){
			return "."; 
		}
		return spiller.toString();
 
		/* Eventuelt: 
		 * Gi spiller en hentNr-metode og skriv
		 * spiller.hentNr();
		 */
	}
}
