public class Rektangel{
	private int hoyde; 
	private int lengde; 

	// lagre hoyden til rektangelet i variabelen hoyde
	public void settHoyde(int h) {
		hoyde = h; 
	}

	// lagre lengden til rektangelet i variabelen lengde 
	public void settLengde(int l) {
		lengde = l; 
	}
	
	// beregn omkretsen til rektangelet
	public int beregnOmkrets() {
		int omkrets = hoyde + hoyde + lengde + lengde; 
		return omkrets; 
	}

	// beregn arealet til rektangelet
	public int beregnAreal() {
		return hoyde*lengde; 
	}
}
