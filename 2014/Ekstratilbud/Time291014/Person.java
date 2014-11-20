import java.util.*;

public class Person{
  private String navn; // navnet paa personen
  private ArrayList<Vare> mineVarer = new ArrayList<Vare>(); // varene til personen

  public Person(String navn){
    this.navn = navn;
  }

  /* toString metode som returnerer navnet paa personen */
  public String toString(){
    return navn;
  }

  /*
  * @param varenavn navn paa varen som personen har kjopt
  * Metode for aa lagre varen i arraylisten
  */
  public void kjopVare(String varenavn){
    // Lager en boolean for aa sjekke om varen finnes i listen
    boolean funnetVare = false;

    // Sjekker om personene allerede har varen i sine varer:
    for (Vare vare : mineVarer){
      if (vare.hentVarenavn().equals(varenavn)){
        // Varen finnes: ok antallet:
        vare.okAntall();
        funnetVare = true;
      }
    }
    if (!funnetVare){
      // Vi har ikke funnet varen blant mineVarer:
      Vare nyVare = new Vare(varenavn);
      nyVare.leggTilAntall(1);
      mineVarer.add(nyVare);
    }
  }

  public void printAlleVarer(){
    System.out.println(this + " sine vare: ");
    for (Vare vare : mineVarer){
      System.out.println(vare + ", antall: " + vare.hentAntall());
    }
  }
}
