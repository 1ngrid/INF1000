public class Brett{
	Plass[] rad1; 
	Plass[] rad2; 
	Plass[] rad3; 
	int teller; 

	Brett(){
		rad1 = new Plass[3];
		rad2 = new Plass[3]; 
		rad3 = new Plass[3];
		fyllRadene();
		teller = 0; 
	}

	public void fyllRadene(){
		for (int i = 0; i < rad1.length; i++){
			rad1[i] = new Plass(); 
			rad2[i] = new Plass(); 
			rad3[i] = new Plass();
		}
	}

	public String toString(){
		String mittBrett = ""; 
		for (int i = 0; i < rad1.length; i++){
			/*	if (rad1[i] != null){
				mittBrett += rad1[i]; 
			}else{
				mittBrett += ".";
			}

			if (rad2[i] != null){
				mittBrett += " " + rad2[i]; 
			}else{
				mittBrett +=" ."; 
			}

			if (rad3[i] != null){
				mittBrett += " " + rad3[i]; 
			}else{
				mittBrett += " ."; 
			}
			mittBrett += "\n";*/

			/* easy version: */ 
			   mittBrett += rad1[i] + " " + 
			   rad2[i] + " " + 
			   rad3[i] + "\n"; 
		}
		return mittBrett; 
	}

	public boolean erFullt(){
		if (teller == 9){
			return true; 
		}
		return false; 
	}

	public boolean settBrikke(int rad, int plass, Spiller s){
		if (plass > 2){
			System.out.println("Ugyldig valg"); 
			return false; 
		}
		if (rad == 0){
			if (rad1[plass].erLedig()){
				rad1[plass].settBrikke(s);
				teller++; 
				return true; 
			}
			System.out.println("Plassen er ikke ledig");
			return false; 
		}
		if (rad == 1){
			if (rad2[plass].erLedig()){
				rad2[plass].settBrikke(s); 
				teller++;
				return true; 
			}
			System.out.println("Plassen er ikke ledig");
			return false; 
		}
		if (rad == 2){
			if (rad3[plass].erLedig()){
				rad3[plass].settBrikke(s); 
				teller++; 
				return true; 
			}
			System.out.println("Plassen er ikke ledig");
			return false; 
		}
		System.out.println("Ugyldig valg");
		return false; 
	}
}
