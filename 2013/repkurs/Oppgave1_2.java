class Oppgave1_2{
    public static void main(String[] args) {
	new Hjelpeklasse();
    }
}

class Hjelpeklasse{

    Hjelpeklasse(){
	String tekst = "aababbabbac";
	char b = 'a'; 
	System.out.println(forekommer(b, tekst));
	System.out.println(utenRepetisjon(tekst));
	System.out.println(antallForskjellige(tekst));
    }

    boolean forekommer(char c, String tekst){
	for(int i = 0; i < tekst.length(); i++){
	    Character b = tekst.charAt(i);
	    if (b.equals(c)){
	    //if(tekst.charAt(i)  == c){
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
	/*	String nyTekst = utenRepetisjon(tekst);
		return nyTekst.length();*/
	return utenRepetisjon(tekst).length();
    }
}
