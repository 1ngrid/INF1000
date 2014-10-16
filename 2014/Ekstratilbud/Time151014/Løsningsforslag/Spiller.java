public class Spiller{
	private String navn; 
	private Stein steinPeker; // peker til et stein-objekt
	private Saks saksPeker; // peker til et saks-objekt
	private Papir papirPeker; // peker til et papir-objekt

	Spiller(String n){
		navn = n; 
	}

	public String toString(){
		return navn;
	}

	/**
	 * Hvis spilleren velger stein, gir vi steinobjektet til spilleren
	 */
	public void velgStein(Stein s){
		steinPeker = s; 
	}

	/**
	 * @return true hvis spilleren har en stein, false hvis den ikke har det
	 */
	public boolean harStein(){
		if (steinPeker != null){
			return true; // vi har et stein-objekt
		}
		return false; 
	}

	/* Lag til metoder for aa sjekke for saks og papir ogsaa */
	public void velgSaks(Saks s){
		saksPeker = s; 
	}

	public boolean harSaks(){
		if (saksPeker != null){
			return true; 
		}
		return false;
	}

	public void velgPapir(Papir p){
		papirPeker = p; 
	}
	
	public boolean harPapir(){
		if (papirPeker != null){
			return true; 
		}
		return false; 
	}
}
