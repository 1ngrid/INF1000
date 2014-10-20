public class Spill{
  public Spill(){

    Spiller espen = new Spiller("Espen Askeladd");
    espen.kastTerninger();
    skrivUtKast(espen);
    boolean kastetYatzy = kastetYatzy(espen);
    if (kastetYatzy == true){
      System.out.println(espen + " kastet yatzy");
    }else{
      System.out.println(espen + " kastet ikke yatzy");
    }
  }

  /**
  * @param s spilleren vi onsker aa skrive ut terningene til
  * Metoden for aa skrive ut hva en spiller har kastet
  */
  public void skrivUtKast(Spiller s){
    Terning[] terninger = s.hentTerninger();
    System.out.println(s + " kastet: ");
    for (int i = 0; i < terninger.length; i++){
      System.out.print(terninger[i] + " ");
    }
    System.out.println();
  }

  /**
  * Denne metoden kan vaere laget enten her, eller hos spilleren
  * det er helt opp til det hvor du velger aa legge den
  */
  public boolean kastetYatzy(Spiller s){
    Terning[] terninger = s.hentTerninger();
    int forsteVerdi = terninger[0].hentVerdi();
    for (int i = 0; i < terninger.length; i++){
      if (forsteVerdi != terninger[i].hentVerdi()){
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args){
    new Spill();
  }

}
