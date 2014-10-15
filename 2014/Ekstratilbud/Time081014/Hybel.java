public class Hybel{
	private int etg; 
	private char bokstav; 
	private Student leietaker; 

	/**
	 * @param e etasjen til hybelen 
	 * lagrer hvilken etasje hybelen horer til
	 */
	public void settEtg(int e){
		etg = e; 
	}

	/**
	 * @param b bokstaven til hybelen
	 * lagrere bokstaven som en hybeln tilhorer 
	 */
	public void settBokstav(char b){
		bokstav = b; 
	}

	/*------------------------------*/
	/* I stedet for metodene over kunne vi laget en metode for aa lagre 
	   begge deler, feks slik: 
	   
	   public void settEtgOgBokstav(int e, char b){
	      etg = e; 
		  bokstav = b; 
	   }
	*/

	/**
	 * Returnerer etasjen til hybelen
	 */
	public int hentEtg(){
		return etg; 
	}

	/**
	 * returnerer bokstaven til hybelen 
	 */
	public char hentBokstav(){
		return bokstav; 
	}


	/**
	 * Metode for at en student skal kunne flytte inn i hybelen 
	 */	
	public void flyttInn(Student s){
		// sjekker om hybelen er ledig, ingen bor der
		if (leietaker == null){
			// lagrer studenten som leietaker 
			leietaker = s; 
		}else{
			// hvis hybelen ikke er ledig: gir feilmelding til bruker
			System.out.println("Hybelen er ikke ledig");
		}
	}

	/**
	 * Metode for at en student skal kunne flytte ut.
	 */
	public void flyttUt(){
		// Sjekker at det faktisk bor noen der
		if (leietaker != null){
			leietaker = null; // fjerner studenten
		}else{
			// hvis hybelen er ledig: gir feilmelding til bruker
			System.out.println("Hybelen er ledig, ingen kan flytte ut");
		}
	}

	/**
	 * @return leietakeren som bor i hybelen
	 * en metode som returnerer leietakeren som bor i hybelen
	 */
	public Student hentLeietaker(){
		return leietaker;
	}

}

