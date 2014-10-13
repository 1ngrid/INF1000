public class Bondegard{
	Gris[] grisebinge = new Gris[10];
	Hest[] stall = new Hest[5];
	Ku[] fjos = new Ku[30];
	int griseteller = 0;

	public void settInnGris(Gris g) {
		if (griseteller == 10) {
			System.out.println("Grisebingen er full");
			return;
		}
		grisebinge[griseteller] = g;
		griseteller++;

	}

	public void skrivUt() {
		System.out.println("I bondegarden:"); 
		for (int i = 0; i < grisebinge.length; i++) { //griseteller
			if (grisebinge[i] != null){
				System.out.println(grisebinge[i].hentNavn()); 
			}
		}
	}

	public static void main(String[] args) {
		Gris g = new Gris(); 
		g.giNavn("Nasse");
		
		Bondegard bondegard = new Bondegard(); 
		bondegard.settInnGris(g); 

		Gris g2 = new Gris(); 
		g2.giNavn("Noff"); 
		bondegard.settInnGris(g2);

		bondegard.skrivUt();
	}
}
