public class Oppgave{
  public static void main(String[] args){

    // Oppretter en butikkeier
    Person butikkeier = new Person("Rimi Hagen");
    // Oppretter et butikk-objekt med en eier
    Butikk butikk = new Butikk(butikkeier);

    // Oppretter en tre kunder
    Person espen = new Person("Espen Askeladd");
    Person per = new Person("Per Askeladd");
    Person paal = new Person("Paal Askeladd");

    // Oppretter potetgull, brus og sjokolade
    Vare potetgull = new Vare("potetgull");
    Vare brus = new Vare("brus");
    Vare sjokolade = new Vare("sjokolade");

    // Legger til 3 poser potetgull
    potetgull.leggTilAntall(3);
    butikk.leggTilVare(potetgull);

    //LEgger til 4 flasker brus:
    brus.leggTilAntall(4);
    butikk.leggTilVare(brus);

    //Legger til 5 plater sjokolade
    sjokolade.leggTilAntall(5);
    butikk.leggTilVare(sjokolade);

    // Print alle varene i butikken:
    System.out.println("Varene i butikken: ");
    butikk.printAlleVarer();


    // La en kunde kjope en pose potetgull og flaske brus. Print varene til kunden:
    butikk.kjopVare("potetgull", espen);
    butikk.kjopVare("brus", espen);
    espen.printAlleVarer();

    //Sjekker at antallet i butikken er endret.
    System.out.println("Varene i butikken: ");
    butikk.printAlleVarer();
  }
}
