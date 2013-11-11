import easyIO.*;
import java.util.*;

class Oblig2{
	public static void main(String[] args) {
		FugleSystem f =new FugleSystem();
		f.meny();
	}
}

class FugleSystem{
	In in = new In();
	HashMap<String, Fugl[]> fugler = new HashMap<String, Fugl[]>();
	HashMap<String, Observasjon[]> observasjoner = new HashMap<String, Observasjon[]>();
	int fuglTeller = 0;
	int obsTeller = 0; 
	void meny(){
		int valg = 0;
		while(valg != 4){
			printMeny();
			valg = in.inInt();
			in.inLine();
			switch (valg){
			case 1: leggTilOberservasjon(); break;
			case 2: printFugl();break;
			case 3: printSted();break;
			default: break;
			}
		}
	}

	void printSted(){
		System.out.println("Skriv inn et sted:");
		String sted = in.inLine();
		Observasjon[] obsarray = observasjoner.get(sted);
		System.out.println("Observasjoner på " + sted + ":"); 
		for (Observasjon o: obsarray){
			if (o != null){
				System.out.println(o.f.navn + " " + o.f.kjonn);
			}
		}
	}

	// Denne metoden kunne kanskje heller brukt observasjoner
	void printFugl(){
		System.out.println("Skriv inn et navn: ");
		String navn = in.inLine();
		Fugl[] fuglearray = fugler.get(navn);
		System.out.println("Observarsjoner av fugletypen: "); 
		for (Fugl fugl : fuglearray){
			if (fugl != null){
				if (fugl.kjonn != null){
					System.out.println(fugl.navn + " " + fugl.kjonn);
				}else{
					System.out.println(fugl.navn);
				}
			}
		}
	}
	void leggTilOberservasjon(){
		System.out.println("Navn: ");
		String navn = in.inLine();
		System.out.println("Kjonn: ");
		String kjonn = in.inLine();
		System.out.println("Sted: ");
		String sted = in.inLine();
		System.out.println("Tid: ");
		String tid = in.inLine();

		Fugl f = new Fugl(navn, kjonn);
		Observasjon o = new Observasjon(tid, sted, f);

		// Legger til en fugleobservasjon sortert paa fuglenavn
		if (fugler.containsKey(f.navn)){
			Fugl[] farray = fugler.get(f.navn);
			farray[fuglTeller++] = f;
			fugler.put(f.navn, farray);
		}else{
			// Finnes ingen tidligere observasjoner av fugletypen
			Fugl[] farray = new Fugl[1000]; 
			farray[fuglTeller++] = f; 
			fugler.put(f.navn, farray); 
		}

		// Legger til observasjoner sortert paa sted
		if (observasjoner.containsKey(sted)){
			Observasjon[] oarray = observasjoner.get(sted);
			oarray[obsTeller++] = o;
			observasjoner.put(sted, oarray);
		}else{
			// Finnes ingen tidligere observasjoner paa stedet
			Observasjon[] oarray = new Observasjon[1000]; 
			oarray[obsTeller++] = o; 
			observasjoner.put(sted, oarray); 
		}
	}

	void printMeny(){
		System.out.println("1. registrer observasjon");
		System.out.println("2. print observasjoner av fugletype");
		System.out.println("3. print obersvasjoner paa sted"); 
		System.out.println("4. avslutt"); 
	}

}

class Observasjon{
	String tid;
	String sted;
	Fugl f;

	Observasjon(String tid, String sted, Fugl f){
		this.tid = tid;
		this.sted = sted;
		this.f = f;
	}
}

class Fugl{
	String navn;
	String kjonn;
	boolean kjent;

	Fugl(String navn, String kjonn){
		this.navn = navn;
		this.kjonn = kjonn;
		kjent = true;
	}

	Fugl(String navn){
		this.navn = navn;
		kjent = false;
	}

}
