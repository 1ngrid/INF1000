public class Oppgave{
	public static void main(String[] args) {
		
		// oppretter et hybelhus
		Hybelhus hus = new Hybelhus(); 
		// lager hybler i hybelhusene
		hus.opprettHybler();

		// Lager to studenter
		Student s1 = new Student();
		s1.giNavn("Siri");
		Student s2 = new Student();
		s2.giNavn("Dag");

		// Flytter inn s1 (siri):
		hus.flyttInn(s1);
		
		// Flytter inn s2 (dag):
		hus.flyttInn(s2);

		// skriv ut alle leieboere: 
		hus.skrivUtAlleLeieboere();

	}
}
