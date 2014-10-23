import java.util.ArrayList;

public class Resultatsystem{
  private ArrayList<Resultat> resultater = new ArrayList<Resultat>();

  /**
  * @param r resultatet som skal legges til i listen
  */
  public void leggTilResultat(Resultat r){
    resultater.add(r);
  }

  /**
  * @return en ArrayList av alle resultater
  */
  public ArrayList<Resultat> hentAlleResultater(){
    return resultater;
  }

  public ArrayList<String> finnAlleStudenterMedKarakter(char onsketKarakter){
    ArrayList<String> studentNavn = new ArrayList<String>();
    for (Resultat r : resultater){
      if (r.hentKarakter() == onsketKarakter){
        studentNavn.add(r.toString());
      }
    }
    return studentNavn;
    /* Alternativt:
    for (int i = 0; i < resultater.size(); i++){
      Resultat r = resultater.get(i);
      if (r.hentKarakter() == onsketKarakter){
        studentNavn.add(r.toString());
      }
    }
    */
  }

}
