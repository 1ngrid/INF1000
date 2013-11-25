class Oppgave1{
    public static void main(String[] args) {
	new Hjelpeklasse();
    }
}

class Hjelpeklasse{

    Hjelpeklasse(){
	String tekst = "aababbabbac";
	char b = 'o'; 
	System.out.println(forekommer(b, tekst));
	System.out.println(utenRepetisjon(tekst));
	System.out.println(antallForskjellige(tekst));
    }

    boolean forekommer(char c, String tekst){
	for(int i = 0; i < tekst.length(); i++){
	    char bokstav = tekst.charAt(i); 
	    if(bokstav == c){
		return true; 
	    }
	}
	return false; 
    }

    String utenRepetisjon(String tekst){
	String nyTekst = ""; 
	for(int i = 0; i < tekst.length(); i++){
	    if(!forekommer(tekst.charAt(i), nyTekst)){
		nyTekst += tekst.charAt(i);
	    }
	}
	return nyTekst; 
    }

    int antallForskjellige(String tekst){
	return utenRepetisjon(tekst).length();
	/*
	int antall = 0; 
	String nyTekst = utenRepetisjon(tekst); 
	for(int i = 0; i < nyTekst.length(); i++){
	    antall++; 
	}
	return antall; */
    }
}
