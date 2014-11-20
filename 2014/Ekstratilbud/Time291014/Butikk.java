import java.util.*;

public class Butikk{
  private ArrayList<Vare> varer = new ArrayList<Vare>(); // alle varene i butikken
  private Person eier; // eieren til butikken.

  public Butikk(Person eier){
    this.eier = eier;
  }

  /*
  * @return en liste over alle varene i butikken
  */
  public ArrayList<Vare> hentVarer(){
    return varer;
  }

  public void leggTilVare(Vare vare){
    varer.add(vare);
  }

  /**
  * @param varenavn: navnet paa varen vi onsker aa sjekke om finnes i butikken
  * @return den aktuelle varen hvis den finnes, hvis ikke returnerer den null
  */
  public Vare finnVare(String varenavn){
    for (Vare vare : varer){
      if (vare.hentVarenavn().equals(varenavn)){
        return vare;
      }
    }
    return null;
  }

  /**
  * Metode for  aa kjope en vare gitt et varenavn ogg en kunde som onsker aa kjope varen
  * @param varenavn: navnet paa varen kunden onsker aa kjope
  * @param k: kunden som onsker aa kjope varen
  *
  */
  public void kjopVare(String varenavn, Person kunde){
    Vare finnVare = finnVare(varenavn);
    if (finnVare != null){
      // Varen finnes i butikken, saa reduseres antallet av varen
      finnVare.reduserAntall();
      // Kunden kjoper varen
      kunde.kjopVare(varenavn);
    }
  }

  /* Metode for aa printe alle varene i butikken med antallet.  */
  public void printAlleVarer(){
    for (Vare v : varer){
      System.out.println(v + ", antall: " + v.hentAntall());
    }
  }
}
