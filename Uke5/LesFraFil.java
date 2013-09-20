/* - Les inn et ord fra brukeren.
   - Les inn et filnavn fra brukeren.
   - Aapne en tekstfil med dette filnavnet
   - Finn antall ganger dette ordet finnes i filen

   - Ekstra:
   Finn antall forekomster av ordet uavhengig av stor forbokstav*/

import easyIO.*;
import java.util.*;
import java.io.*;

class LesFraFil{
    public static void main(String[]args){ 
	//throws FileNotFoundException
	/*
	  In tast = new In();
	  String ord = tast.inWord();
	  String filnavn = tast.inWord();

	  System.out.println(ord);
	  System.out.println(filnavn);

	  In innfil = new In(filnavn);
	  int cnt = 0;
	  while(!innfil.endOfFile()){
	  if(innfil.inWord().equalsIgnoreCase(ord)){
	  cnt++;
	  }
	  }
	  innfil.close();
	  System.out.println(cnt);*/

	Scanner tast = new Scanner(System.in);
	String ord = tast.next();
	String filnavn = tast.next();

	try{
	    File f = new File(filnavn);
	    Scanner fil = new Scanner(f);
	    // new Scanner(new File(filnavn));
	    int cnt = 0;
	    while(fil.hasNext()){
		String nyttOrd = fil.next();
		if(nyttOrd.equals(ord)){
		    cnt++;
		}
	    }
	    fil.close();
	    System.out.println(cnt);
	}catch(FileNotFoundException e){
	    System.out.println("Kunne ikke finne filen");
	}
    }
}


