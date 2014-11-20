public class Vare{
  public String varenavn; // navnet paa varen
  public int antall; // Antallet av varen som finnes

  public Vare(String varenavn){
    this.varenavn = varenavn;
  }

  /**
  * @return antallet som finnes av varen
  */
  public int hentAntall(){
    return antall;
  }

  /*
  * @param antall: antallet av varen som finnes
  */
  public void leggTilAntall(int antall){
    this.antall = antall;
  }

  /*
  * @return navnet paa varen
  */
  public String hentVarenavn(){
    return varenavn;
  }

  /* Metode for aa redusere antallet av varen */
  public void reduserAntall(){
    antall--;
  }

  /* Metode for aa oke antallet av varen */
  public void okAntall(){
    antall++;
  }

  /* toString som returnerer navnet paa varen */
  public String toString(){
    return varenavn; 
  }
}
