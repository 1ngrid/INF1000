public class Spiller{
    private String navn;
    private Terning[] mineTerninger = new Terning[5];

    public Spiller(String navn){
        this.navn = navn;
    }

    /**
    * Metode for aa la spilleren kaste terningene.
    */
    public void kastTerninger(){
      for (int i = 0; i < mineTerninger.length; i++){
        mineTerninger[i] = new Terning();
      }
    }

    /**
    * @return terningene til spilleren.
    */
    public Terning[] hentTerninger (){
      return mineTerninger;
    }

    /**
    * @return navnet paa spilleren
    * Metode for aa printe ut spilleren på en pen maate
    */
    public String toString(){
      return navn;
    }

}
