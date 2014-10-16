import java.util.Scanner; 

public class Spill{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 
		Spiller spiller = new Spiller(in.nextLine()); 
		System.out.println("Skriv inn stein, saks eller papir"); 
		String valg = in.nextLine(); 
		valg = valg.toLowerCase(); // gjor alle bokstavene til smaa

		if (valg.equals("stein")){
			Stein steinObjekt = new Stein(); 
			spiller.velgStein(steinObjekt);
		}
	}
}
