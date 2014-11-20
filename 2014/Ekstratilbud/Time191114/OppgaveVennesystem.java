import java.util.*;
import java.io.*;

public class OppgaveVennesystem{

    public static void main(String[] args) throws Exception {
	Vennesystem vs = new Vennesystem();
	Person nyPerson = null;
	Scanner in = new Scanner(new File("filnavn.txt"));

	while(in.hasNextLine()){
	    String navn = in.nextLine();
	    
	    if(navn.charAt(0) == '*'){
		//funnet en venn
		Person venn = new Person(navn.substring(1,navn.length()));
		if(vs.finnes(venn)){
		    venn = vs.hent(venn.toString());
		    nyPerson.leggTilVenn(venn);
		}else{
		    vs.leggTilPerson(venn);
		    nyPerson.leggTilVenn(venn);
		}
	    }else{
		//funnet en person
		nyPerson = new Person(navn);
		
		if(!vs.finnes(nyPerson)){
		    vs.leggTilPerson(nyPerson);
		}else{
		    nyPerson = vs.hent(navn);
		}
	    }
	}

    }

}