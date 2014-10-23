import java.util.ArrayList;

public class INF1000{
  public static void main(String[] args){
    Resultat r1 = new Resultat("Espen Askeladd", 'A');
    Resultat r2 = new Resultat("Per Askeladd", 'B');
    Resultat r3 = new Resultat("Paal Askeladd", 'C');

    Resultatsystem resultatsystem = new Resultatsystem();
    resultatsystem.leggTilResultat(r1);
    resultatsystem.leggTilResultat(r2);
    resultatsystem.leggTilResultat(r3);

    /* Henter alle resultater og sjekker at de er lagt til */
    ArrayList<Resultat> resultater = resultatsystem.hentAlleResultater();
    for (Resultat r: resultater){
      System.out.println(r);
    }

    /* Finner alle studenter som fikk A paa eksamen */
    ArrayList<String> studenter = resultatsystem.finnAlleStudenterMedKarakter('A');
    System.out.println("Studenter som fikk A: ");
    System.out.println(studenter.toString()); // Bruker arraylist sin toString-metode for aa printe alle studentene som ligger i lista

    // Sjekker programmet ved aa legge til en student til som fikk A
    resultatsystem.leggTilResultat(new Resultat("Prinsessa", 'A'));

    studenter = resultatsystem.finnAlleStudenterMedKarakter('A'); // oversrkiver arraylisten paa linje 21
    System.out.println("Studenter som fikk A: ");
    System.out.println(studenter.toString()); // Bruker arraylist sin toString-metode for aa printe alle studentene som ligger i lista

  }
}
