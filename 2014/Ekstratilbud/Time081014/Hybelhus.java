public class Hybelhus{
	Hybel[] hybler = new Hybel[10]; // 10 hybler i hybelhuset

	/**
	 * Oppretter et hybel-objekt paa hver posisjon i arrayen over hybler.  
	 */
	public void opprettHybler(){
		for (int i = 0; i < hybler.length; i++){
			hybler[i] = new Hybel(); // oppretter en hybel paa hver posisjon
		}
	}


	/** 
	 * @param s studenten som onsker aa flytte inn i hybelhuset
	 * Metoden finner forste ledige hybel og flytter studenten inn i denne
	 * (dette gjores ved at vi kaller hybelens flyttInn-metode
	 */
	public void flyttInn(Student s){
		for (int i = 0; i < hybler.length; i++){
			if (hybler[i] == null){
				hybler[i].flyttInn(s);
				return; // returnerer tilbake til der metoden ble kalt fra 
				// hvorfor? fordi vi ikke onsker aa flytte studenten inn i alle 
				// ledige hybler
				// eventult kan du skrive: break; 
			}
		}
	}

	/*------------------------------------- */
	/* NOTE: 
	 * Vi kunne valgt aa ha en teller (hybelteller) slik vi gjorde i ekstratimen.
	 * Problemet er hvis person i hybel 0 flytter ut og en ny person flytter inn. 
	 * Da onsker vi kanskje at neste student som flytter inn skal bo i den hybelen
	 * slik at den alltid er fylt opp forfra. 
	 */

	public void skrivUtAlleLeieboere(){
		
		// Gaar gjennom alle hyblene
		for (int i = 0; i < hybler.length; i++){
			Hybel h = hybler[i]; // henter ut hybelen
			
			Student s = h.hentLeietaker(); // henter leietakeren som bor i hybelen
			// hvis studenten ikke er null: print studentens navn
			if (s != null){
				System.out.println("Student: " + s.hentNavn()); 
			}
		}
	}
}
