public class Oppgave{
  public Oppgave(){

      Person espen = new Person("Espen Askeladd");
      Person per = new Person("Per Askeladd");
      Person paal = new Person("Paal Askeladd");
      Person prinsessa = new Person("Prinsessa");

      espen.leggTilVenn(prinsessa);
      espen.leggTilUvenn(per);
      espen.leggTilUvenn(paal);
      espen.leggTilVenn(per);

      espen.skrivUtVennesystem();

      /* Sjekk for gjensidig vennskap: */
      prinsessa.skrivUtVennesystem();

  }

  public static void main(String[] args){
    new Oppgave();
  }
}
