import easyIO.*;

class MenneskeOppgave{

	public static void main(String[] args){
		LesFraFil s = new LesFraFil();
		s.lesFraFil();
		s.printStudenter();
		s.presenterStudenter();
	}
}

class LesFraFil{
	Menneske[] studenter = new Menneske[30];
	String[] navn = new String[30];
	String filnavn = "fil.txt";
	In input= new In(filnavn);
	void lesFraFil(){

		int teller = 0;
		// while input ikke ferdig

		while(!input.endOfFile()){
			// System.out.println("i while lokke");
			String line = input.inLine();
			// System.out.println(line);
			String[] splittet = line.split("\\s+");

			for (int i = 0; i< splittet.length; i++){
				System.out.println(splittet[i]);
			}
			Menneske m = new Menneske(splittet[0]);
			studenter[teller] = m;
			teller++;
			// Alternativ: studenter[teller++] = m;
			// Alternativ 2: studenter[teller++] = new Menneske(splittet[0]);
		}
	}
	void printStudenter(){
		for (int i = 0; i < studenter.length; i++){
			//System.out.println(studenter[i]);
			if(studenter[i] != null){
				String studentNavn = studenter[i].navn;
				System.out.println(studentNavn);
			}
		}
	}

	// Metode for aa presentere studentene
	void presenterStudenter(){
		for (int i = 0; i < studenter.length; i++){
			if(studenter[i] != null){
				studenter[i].presenter();
			}
		}
	}
}

// En klasse for menneske
class Menneske{
	String navn;

	// Konstruktor. Dette gjor at naar vi lager et menneske-objekt maa
	// man skrive new Menneske(medEnStringHer);
	Menneske(String n){
		navn = n;
	}

	// Metode for aa presentere seg selv
	void presenter(){
		System.out.println("Hallo, jeg heter " + navn);
	}
}
