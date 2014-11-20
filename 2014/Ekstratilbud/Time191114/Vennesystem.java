import java.util.*;

public class Vennesystem{
    private ArrayList<Person> personer = new ArrayList<Person>();
    
    public void leggTilPerson(Person p){
	if(finnes(p)){
	    System.out.println(p.toString() + " finnes allerede");
	}else{
	    personer.add(p);
	}
    }

    public boolean finnes(Person p){
	for(Person pers : personer){
	    if(pers.toString().equals(p.toString())){
		return true;
	    }
	}
	return false;
    }

    public Person hent(String navn){
	for(int i = 0; i < personer.size(); i++){
	    if(personer.get(i).toString().equals(navn)){
		return personer.get(i);
	    }
	}
	return null;
    }

}