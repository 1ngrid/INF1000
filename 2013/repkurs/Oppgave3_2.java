import java.io.*;
import java.util.*;

class Oppgave3_2{
    public static void main(String[] args) {
	new Hjelpeklasse();
    }
}

class Hjelpeklasse{
    Hjelpeklasse(){
	skrivNavn();
    }

    void skrivNavn(){
	Scanner input = new Scanner(System.in);
	char svar = 'j';
	/*
	  FileWriter f	= null;
	  try{
	  f = new FileWriter("output", true);
	  }*/
	while(svar == 'j'){
	    System.out.print("Skriv et navn: ");
	    String navn = input.nextLine();
	    for(int i = 0; i < 100; i++){
		try{
		    FileWriter f = new FileWriter("navn.output", true);
		    f.write(navn + " ");
		    f.close();
		}catch(IOException e){
		    System.out.println("Feil ved skriving til fil");
		    System.out.println(e.getStackTrace());
		}
	    }
	    System.out.print("Gi et nytt navn? (j/n): ");
	    svar = input.nextLine().charAt(0);
	}

    }
}
