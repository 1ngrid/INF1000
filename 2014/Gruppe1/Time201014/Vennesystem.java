import java.util.ArrayList;

public class Vennesystem{
  ArrayList<Person> venner = new ArrayList<Person>();
  ArrayList<Person> uvenner = new ArrayList<Person>();

  public void leggTilVenn(Person venn){
    if (erUvenn(venn)){
      System.out.println("Kan ikke legge til " + venn + " som venn. Er allerede uvenner");
      return;
    }
    venner.add(venn);
  }

  public void leggTilUvenn(Person uvenn){
    if (erVenn(uvenn)){
      System.out.println("Kan ikke legge til " + uvenn + " som uvenn. Er allerede venner. ");
      return;
    }
    uvenner.add(uvenn);
  }

  public void skrivUt(){
    System.out.println("Venner: ");
    for (Person v : venner){
      System.out.println(v);
    }
    System.out.println("Uvenner: ");
    for (Person u : uvenner){
      System.out.println(u);
    }
  }

  public boolean erVenn(Person p){
    if (venner.contains(p)) {
      return true;
    }
    return false;
  }

  public boolean erUvenn(Person p){
    if (uvenner.contains(p)){
      return true;
    }
    return false;
  }

  /**
  * Gjensidig vennskap
  */

  public void bliVenn(Person venn){
    venner.add(venn);
  }
}
