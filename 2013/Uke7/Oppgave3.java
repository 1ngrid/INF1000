class Oppgave3{
	public static void main(String[] args){
		Bondegaard b = new Bondegaard();
		b.fyllInnDyr();
		System.out.println("Printer ut alle dyrene:\n");
		b.print();
		b.selgDyr();
		System.out.println("\n\n\nPrinting etter at vi har solgt dyr:\n\n");
		b.print();
		System.out.println(); 
	}

}

class Bondegaard{
	Gris[] grisebinge = new Gris[10];
	Hest[] stall = new Hest[5];
	Sau[] gresslette = new Sau[30];

	void fyllInnDyr(){
		// Lager en array med grisenavn slik at antall navn er mindre
		// enn det totale antallet griser vi skal lage
		String[] grisenavn = {"Noff", "Nass", null, "Grynt", null, "Svinulf", "Orky", "Gisse"};

		int teller = 0;
		for (int i = 0; i < grisebinge.length; i++){
			Gris g = new Gris();
			if (teller < grisenavn.length){
				g.navn = grisenavn[teller];
				teller++;
			}
			grisebinge[i] = g;
		}
		// Gir navn til hestene, kaller dem Hest1, Hest2, ...
		for (int i = 0; i < stall.length; i++){
			Hest h = new Hest();
			h.navn = "Hest" + i;
			stall[i] = h;
		}

		// Lager en array med sauenavn
		String[] sauenavn = {"Shawn", null, "Schip", "Schap", "Schop", null, "Snipp", "Snapp", "Snute"}; 

		int saueTeller = 0; 
		for (int i = 0; i < gresslette.length; i++){
			Sau s = new Sau(); 
			if (saueTeller < sauenavn.length){
				s.navn = sauenavn[saueTeller];
				saueTeller++; 
			}
			gresslette[i] = s; 
		}
	}

	// Metode for aa printe ut de ulike dyrene
	void print(){
		System.out.println("I grisebingen er: ");
		for (int i = 0; i < grisebinge.length; i++){
			System.out.print(grisebinge[i].navn + "\t");
		}
		System.out.println("\n\nI stallen er: ");
		for (int i = 0; i < stall.length; i++){
			System.out.print(stall[i].navn + "\t");
		}
		System.out.println("\n\nUte paa gressletten er: ");
		for (int i = 0; i < gresslette.length; i++){
			System.out.print(gresslette[i].navn + "\t");
		}
	}

	void selgDyr(){
		// Selger griser: 
		// Finner samtidig antallet griser som ikke har navn
		int antallGriser = 0;
		for (int i = 0; i < grisebinge.length; i++){
			if(grisebinge[i].navn == null){
				// Sett en arrayplass til aa vaere null er det samme som 
				// aa fjerne den (ingen peker paa den lenger)
				grisebinge[i] = null;
			}else{
				antallGriser++; 
			}
		}
		Gris[] nyGrisebinge = new Gris[antallGriser];
		int teller = 0; // indeks for den nye arrayen
		for (int i = 0; i < grisebinge.length; i++){
			if (grisebinge[i] != null){
				nyGrisebinge[teller++] = grisebinge[i];
			}
		}
		// Flytter pekeren fra den gamle til den nye grisebingen
		// (Da blir den gamle slettet)
		grisebinge = nyGrisebinge;

		// Selger sauer
		int antallSau = 0; 
		for (int i = 0; i < gresslette.length; i++){
			if (gresslette[i].navn == null){
				gresslette[i] = null; 
			}else{
				antallSau++; 
			}
		}

		// Lager en ny gresslette hvor vi lagrer alle sauer
		// som ikke er null
		Sau[] nyGresslette = new Sau[antallSau];
		teller = 0;  // indeks for den nye arrayen
		for (int i = 0; i < gresslette.length; i++){
			if (gresslette[i] != null){
				nyGresslette[teller++] = gresslette[i];
			}
		}
		// Flytter pekeren fra den gamle til den nye gressletten
		// (Da blir den gamle slettet)
		gresslette = nyGresslette;
	}

}
// Klasse for gris
class Gris{
	String navn;
}
// Klasse for hest
class Hest{
	String navn;
}
// Klasse for sau
class Sau{
	String navn;
}
