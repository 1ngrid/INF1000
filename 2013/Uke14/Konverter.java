import easyIO.*;
import java.util.*;

class Konverter{
    public static void main(String[] args) {

	In tast = new In();
	System.out.println("Skriv et tall: ");

	int tall = tast.inInt();

	ArrayList<Integer> rest = new ArrayList<Integer>(); 
	while(tall > 0 ){
	    rest.add(tall % 16);
	    tall = tall/16;
	}
	for (int i = rest.size()-1; i >= 0 ; i--){
	    int r = rest.get(i); 
	    if (r > 9){
		r = r +55; 
		char[] c = Character.toChars(r); 
		System.out.print(c[0]);
	    }else{
		System.out.print(r); 
	    }
	}
	System.out.println();
	int teller = 0; 
	int resultat = 0; 
	for (Integer i: rest){
	    resultat += i*Math.pow(16,teller++);
	}
	System.out.println(resultat);
    }
}
