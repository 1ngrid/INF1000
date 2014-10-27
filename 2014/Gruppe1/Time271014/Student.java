import java.util.ArrayList;

public class Student{
  String navn;
  ArrayList<String> fag = new ArrayList<String>();
  public Student(String navn){
    this.navn = navn;
  }

  public void leggTilFag(String fagkode){
    fag.add(fagkode);
  }

  public String toString(){
    return navn;
  }

  public ArrayList<String> hentFag(){
    return fag;
  }

}
