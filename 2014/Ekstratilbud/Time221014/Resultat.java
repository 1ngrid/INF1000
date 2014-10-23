public class Resultat{
  private String navn;
  private char karakter;

  public Resultat(String navn, char karakter){
    this.navn = navn;
    this.karakter = karakter;
  }

  /**
  * @return karakteren som ligger i resultat-objektet
  */
  public char hentKarakter(){
    return karakter;
  }

  /**
  * @return navnet paa studenten som fikk karakteren
  */
  public String toString(){
    return navn;
  }

}
