import java.util.*;

public class Spill{
	Scanner in;
	Brett brett;

	Spill(){
		in = new Scanner(System.in);
		System.out.println("Skriv inn navn paa spiller 1:");
		String spiller1navn = in.nextLine();
		System.out.println("Skriv inn navn paa spiller 2:");
		String spiller2navn = in.nextLine();


		// Oppretter spillere:
		Spiller s1 = new Spiller(spiller1navn, "1");
		Spiller s2 = new Spiller(spiller2navn, "2");

		brett = new Brett();

		while(brett.erFullt() == false){
			System.out.println(brett);
			beSpillerSpille(s1);
			if (brett.erFullt()){
				break; 
			}
			System.out.println(brett); 
			beSpillerSpille(s2);

		}


	}
	public static void main(String[] args) {
		new Spill();
	}

	public void beSpillerSpille(Spiller s){
		boolean valgt = false;
		while(valgt == false){
			System.out.println(s.hentNavn() + ", det er din tur. Velg rad: ");
			int rad = Integer.parseInt(in.nextLine());
			System.out.println("Velg plass: ");
			int plass = Integer.parseInt(in.nextLine());

			if (brett.settBrikke(rad, plass, s) == true){
				valgt = true;
			}
		}

	}

}
