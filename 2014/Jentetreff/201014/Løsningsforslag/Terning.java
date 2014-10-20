import java.util.Random;

public class Terning{
  int verdi;

  public Terning(){
    Random random = new Random();
    verdi = random.nextInt(6)+1;
  }

  public String toString(){
    return "" + verdi;
  }

  public int hentVerdi(){
    return verdi; 
  }
}
