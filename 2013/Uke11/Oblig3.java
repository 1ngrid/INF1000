import java.util.*;
import easyIO.*;

class Oblig3{
    public static void main(String[] args){
	if(args.length < 1){
	    System.out.println("kommandolinjeargument!");
	}else{
	    new TekstAnalyse(args[0]);
	    //new TekstAnalyseArrayList(args[0]);
	}
    }
}

class TekstAnalyseArrayList{
    ArrayList<String> ord = new ArrayList<String>();
    ArrayList<Integer> antall = new ArrayList<Integer>();
    String filnavn; 

    TekstAnalyseArrayList(String filnavn){
	this.filnavn = filnavn; 
	lesFraFil();
	print();
    }

    void lesFraFil(){
	In innfil = new In(filnavn); 
	while(innfil.hasNext()){
	    String o = innfil.next().toLowerCase();
	    if(ord.contains(o)){
		int indeks = ord.indexOf(o);
		int forekomst = antall.get(indeks);
		antall.set(indeks, ++forekomst);
	    }else{
		ord.add(o);
		antall.add(1);
	    }
	}	
    }

    void print(){
	for (int i = 0; i < ord.size(); i++){
	    System.out.println(ord.get(i) + "\t" + antall.get(i));
	}
    }
}


class TekstAnalyse{
    HashMap<String, Integer> hash = new HashMap<String, Integer>();
    String filnavn; 

    TekstAnalyse(String filnavn){
	this.filnavn = filnavn; 
	lesFraFil();
	print();
    }

    void lesFraFil(){
	In innfil = new In(filnavn); 
	while(innfil.hasNext()){
	    String ord = innfil.next().toLowerCase();
	    if (hash.containsKey(ord)){
		int forekomst = hash.get(ord); 
		hash.put(ord, ++forekomst);
	    }else{
		hash.put(ord, 1);
	    }
	}	
    }

    void print(){
	for (String s: hash.keySet()){
	    System.out.println(s + "\t" + hash.get(s));
	} 
	/*for (Integer i: hash.values()){
	    System.out.println(i);
	    }*/
    }
}
