import easyIO.*;

class easyIOoppg{
    public static void main(String[] args) {

	new Hjelpeklasse();
    }
}

class Hjelpeklasse{
    Hjelpeklasse(){
	omkrets();
	skrivNavn();
	oppgave4();
    }

    // Oppgave 1
    void omkrets(){
	double omkrets = 0.0;
	Out skjerm = new Out("omkrets.txt", true);
	for (int i = 1; i <= 10; i++){
	    omkrets = 2*3.14*i;
	    skjerm.out("Radius = " + i + " gir omkrets = ");
	    skjerm.outln(omkrets, 2);
	}
	skjerm.close();
    }

    // Oppgave 3
    void skrivNavn(){
	In tast = new In();
	Out skjerm = new Out();
	char svar = 'j';
	while(svar == 'j'){
	    String navn = tast.inLine();
	    for(int i = 0; i < 100; i++){
		skjerm.out(navn + " ");
	    }
	    skjerm.out("Gi nytt navn? (j/n): ");
	    tast.skipWhite();
	    svar = tast.inChar();
	}
    }
    
    // Oppgave 4
    void oppgave4(){
	String[] navnearray = new String[27]; 
	int[] vektarray = new int[27]; 
	In innfil = new In("klasse.txt");
	Out skjerm = new Out(); 
	int linjeTeller = 0; 
	while(!innfil.endOfFile()){
	    String navn = innfil.inWord(); 
	    innfil.skipWhite();
	    int vekt = innfil.inInt();
	    navnearray[linjeTeller] = navn; 
	    vektarray[linjeTeller] = vekt; 
	    linjeTeller++; 
	}
	innfil.close();
	for (int i = 0; i < navnearray.length; i++){
	    skjerm.outln(navnearray[i] + " " + vektarray[i]);
	}

	for (String s: navnearray){
	    skjerm.outln(s);
	}

	for (Integer i : vektarray){
	    skjerm.outln(i);
	}
    }
}
