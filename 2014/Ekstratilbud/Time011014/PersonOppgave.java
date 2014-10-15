/* OPPGAVETEKST: 
 * 1. Les inn filen "navn.txt" som består av annehver linje med navn og alder 
 * 2. Lag en klasse Person som inneholder et navn og en alder. Lag også metoder for å sette og hente verdien til variablene
 * 3. Opprett Person-objekter for alle navnene i filen. 
 */

import java.util.Scanner; 
import java.io.*;

public class PersonOppgave{
	public static void main(String[] args) throws Exception{
		
		// Leser inn filen
		String filnavn = "navn.txt"; 
		File file = new File(filnavn); 
		Scanner innFil = new Scanner(file); 
		
		Person[] personer = new Person[10]; // Antar at det ikke er mer enn 10 personer i filen 

		int teller = 0; 

		while(innFil.hasNextLine()) {
			String navn = innFil.nextLine(); 
			int alder = Integer.parseInt(innFil.nextLine()); 
			Person p = new Person(); 
			p.giNavn(navn); 
			p.giAlder(alder); 
			personer[teller] = p; 
			teller++; // oker telleren 
		}

		printArrayen(personer, teller); 
	}

	/* NB!
	 * La til en metode som printet ut navnet og alderen til alle personene som er lagt til i arrayen.
	 */ 

	public static void printArrayen(Person[] pers, int antPers) {
		for (int i = 0; i < antPers; i++) {
			Person p = pers[i]; 
			System.out.println("Navn: " + p.hentNavn()); 
			System.out.println("Alder: " + p.hentAlder()); 
		}
	}
}
