public class Brett{
	Plass[] rad0 = new Plass[3]; 
	Plass[] rad1; 
	Plass[] rad2;
	int teller = 0; 

	Brett(){
		rad0 = new Plass[3]; 
		rad1 = new Plass[3]; 
		rad2 = new Plass[3]; 
		opprettPlasser();
	}

	public boolean erFullt(){
		if (teller == 9){
			return true; 
		}
		return false; 
	}

	public void opprettPlasser(){
		for (int i = 0; i < rad0.length; i++){
			rad0[i] = new Plass(); 
			rad1[i] = new Plass(); 
			rad2[i] = new Plass(); 
		}
	}
	

	public String toString(){
		String tekst = ""; 
		tekst += rad0[0] + " " + rad0[1] + " " + rad0[2] +"\n";
		tekst += rad1[0] + " " + rad1[1] + " " + rad1[2]+"\n";
		tekst += rad2[0] + " " + rad2[1] + " " + rad2[2]+"\n"; 
		return tekst; 
	}

	public boolean plasserBrikke(int rad, int plass, Spiller s){
		if (rad > 2 || plass > 2){
			System.out.println("Ugyldig valg");
			return false; // ikke plassert.
		}
		if (rad == 0){
			if(rad0[plass].erLedig()){
				System.out.println("Plassen er ledig");
				rad0[plass].plasserBrikke(s);
				teller++;
				return true; 
			} 
			System.out.println("Plassen er ikke ledig");
			return false; 
		}
		return false; 
	}
}
