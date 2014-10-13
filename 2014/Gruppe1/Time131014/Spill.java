import java.util.Scanner; 

public class Spill{
	Scanner in; 
	Brett brett; 
	Spill(){
		in = new Scanner(System.in); 
		Spiller s1 = new Spiller("Espen", 1); 
		System.out.println(s1);

		brett = new Brett(); 

		while(brett.erFullt() == false){
			System.out.println(brett); 
			
			beSpillerOmPlass(s1);
			System.out.println(brett);
		}

	}

	public void beSpillerOmPlass(Spiller s){
		System.out.println(s);
		System.out.println("Skriv inn rad:");
		int rad = Integer.parseInt(in.nextLine()); 
		System.out.println("Skriv inn plass: "); 
		int plass = Integer.parseInt(in.nextLine());
		brett.plasserBrikke(rad, plass, s);
	}


	public static void main(String[] args) {
		new Spill();
	}
}
