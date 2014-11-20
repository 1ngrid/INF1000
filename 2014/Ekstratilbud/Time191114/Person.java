import java.util.*;

public class Person{

    private String navn;
    private HashMap<String, Person> venner = new HashMap<String, Person>();

    public Person(String navn){
	this.navn = navn;
    }

    public String toString(){
	return navn;
    }

    public boolean leggTilVenn(Person p){
	if(venner.containsKey(p.toString())){
	    System.out.println(toString() + " og " + p.toString() + " er allerede venner");
	    return false;
	}else{
	    venner.put(p.toString(), p);
	    System.out.println(p.toString() + " er lagt til som venn hos " + toString());
	    return true;
	}
    }
}