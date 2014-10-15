public class Student{
	private String navn; 

	/**
	 *@param n det nye navnet til studenten
	 *Metode for å gi navn til studenten 
	 */
	public void giNavn(String n){
		navn = n; 
	}

	/**
	 * returner navnet på studenten
	 */
	public String hentNavn(){
		return navn; 
	}
}
