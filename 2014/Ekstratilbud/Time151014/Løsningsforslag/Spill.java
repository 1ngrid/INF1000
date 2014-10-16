import java.util.Scanner; 
import java.util.Random; 

public class Spill{
	Scanner in; // deklarerer Scanner-objektet paa utstiden slik at den er tilgjengelig i hele klassen
	Spiller spiller; // deklarerer spiller paa utsiden av metodene slik at den er tilgjengelig i hele klassen

	Spiller datamaskin; 
	/* Konstruktor til klassen Spill hvor vi gjor alt */
	Spill(){

		in = new Scanner(System.in); 
		spiller = new Spiller(in.nextLine()); 
		datamaskin = new Spiller("Datamaskin"); // oppretter en datamaskin-spiller
		spillSteinSaksPapir();
	}

	public void spillSteinSaksPapir(){
		laSpillerVelge(); 
		laDatamaskinenVelge(); 
		finnVinner(); 
	}
	public void laSpillerVelge(){
		System.out.println("Skriv inn stein, saks eller papir"); 
		String valg = in.nextLine(); 
		valg = valg.toLowerCase(); // gjor alle bokstavene til smaa

		if (valg.equals("stein")){
			Stein steinObjekt = new Stein(); 
			spiller.velgStein(steinObjekt);
		}else if (valg.equals("saks")){
			Saks saksObjekt = new Saks(); 
			spiller.velgSaks(saksObjekt);
		}else if (valg.equals("papir")){
			Papir papirObjekt = new Papir(); 
			spiller.velgPapir(papirObjekt);
		}else{
			System.out.println("Ulovlig valg");
		}
	}
	
	public void laDatamaskinenVelge(){
		String[] valgMuligheter = {"stein", "saks", "papir"}; // array med valgmulighetene. 
		Random r = new Random(); // oppretter et Random-objekt
		int randomTall = r.nextInt(3); // Genrerer et tilfeldig random tall som kan vaere 0,1,2
		 System.out.println("Datamaskinen valgte " + valgMuligheter[randomTall]);
		if (randomTall == 0){
			// datamaskinen velger stein
			Stein steinObjekt = new Stein(); 
			datamaskin.velgStein(steinObjekt); 
		}else if (randomTall == 1){
			// datamaskinen velger saks
			Saks saksObjekt = new Saks(); 
			datamaskin.velgSaks(saksObjekt); 
		}else if (randomTall == 2){
			// datamaskinen velger papir
			Papir papirObjekt = new Papir(); 
			datamaskin.velgPapir(papirObjekt); 
		}
	}
	/*Metode for aa sjekke hvem som vant */
	public void finnVinner(){
		if (spiller.harStein() && datamaskin.harPapir()){
			System.out.println(datamaskin + " har vunnet");
		}else if (spiller.harStein() && datamaskin.harSaks()){
			System.out.println(spiller + " har vunnet"); 
		}else if (spiller.harSaks() && datamaskin.harPapir()){
			System.out.println(spiller + " har vunnet"); 
		}else if (spiller.harSaks() && datamaskin.harStein()){
			System.out.println(datamaskin + "har vunnet");
		}else if (spiller.harPapir() && datamaskin.harStein()){
			System.out.println(spiller + " har vunnet"); 
		}else if (spiller.harPapir() && datamaskin.harSaks()){
			System.out.println(datamaskin + " har vunnet"); 
		}
	}

	public static void main(String[] args) {
		new Spill(); // Lager et nytt objekt av klassen vi jobber med. Kommer da til konstrukturen hvor vi gjor alt.
	}
}
