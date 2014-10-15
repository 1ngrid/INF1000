/* OPPGAVETEKST: 
 * 1. Lag en klasse Rektangel med instansvariablene hoyde og lengde. Lag ogsaa metoder for aa lagre verdier i variablene. 
 * 2. Lag en metode 'beregnOmkrets' for aa beregne omkretsen til et rektangel. 
 * 3. Lag metoden 'beregnAreal'. 
 * 4. Lag 3 rektangler og beregn omkrets og areal av rektanglene. 
 */

public class RektangelOppgave{
	public static void main(String[] args) {
		Rektangel rektangel = new Rektangel(); 
		rektangel.settHoyde(2); 
		rektangel.settLengde(3); 
		// har naa opprettet et rektangel med hoyde 2 og lengde 3
		// printer ut omkrets og areal av rektangelet
		System.out.println("Omkretsen av rektangel med hoyde " + 2 + " og lengde " + 3 + " er " + rektangel.beregnOmkrets()); 
		System.out.println("Arealet av rektangel med hoyde " + 2 + " og lengde " + 3 + " er " + rektangel.beregnAreal()); 

		// Gjenbruker rektangel-variabelen 
		rektangel = new Rektangel(); 
		// rektangel med hoyde 4 og lengde 5
		rektangel.settHoyde(4); 
		rektangel.settLengde(5); 
		System.out.println("Omkretsen av rektangel med hoyde " + 4 + " og lengde " + 5 + " er " + rektangel.beregnOmkrets()); 
		System.out.println("Arealet av rektangel med hoyde " + 4 + " og lengde " + 5 + " er " +rektangel.beregnAreal()); 
		
		// rektangel med hoyde 3 og lengde 5
		rektangel.settHoyde(3); 
		rektangel.settLengde(5); 
		System.out.println("Omkretsen av rektangel med hoyde " + 3 + " og lengde " + 5 + " er " + rektangel.beregnOmkrets()); 
		System.out.println("Arealet av rektangel med hoyde " + 3 + " og lengde  " + 5 + " er " +rektangel.beregnAreal()); 

		
	}
}
