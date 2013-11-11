import easyIO.*;

class Familie{
    public static void main(String[] args){
	Mor m = new Mor("Anne"); //, d);

	In innfil = new In("fil.txt"); 
	while(!innfil.endOfFile()){
	    Datter d = new Datter(innfil.inLine()); //, new Mor("Anne", d));
	
	    // m.d = d;
	    m.leggTilBarn(d);
	    d.m = m;
	}

	// Hvordan kan jeg sette Ada til å være datter til Anne
	// og samitid sette Anne til å være mor til Ada?
    }
}

class Mor{
    String navn;
    Datter[] d; 
    int teller = 0; 
    Mor(String navn){
	this.navn = navn;
	d = new Datter[20];
	//	this.d = d; 
	    
    }

    void leggTilBarn(Datter datter){
	d[teller] = datter; 
	teller++;
    }
    
}

class Datter{
    String navn; 
    Mor m; 
    Datter(String navn){
	this.navn = navn; 
	//	this.m = m; 
    }
}
