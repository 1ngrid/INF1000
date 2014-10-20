public class Person{
  private Vennesystem mittVennesystem;
  private String navn;

  public Person(String navn){
    this.navn = navn;
    mittVennesystem = new Vennesystem();
  }

  public String toString(){
    return navn;
  }

  public void leggTilVenn(Person venn){
    mittVennesystem.leggTilVenn(venn);
    // gjensidig vennskap:
    venn.bliVenn(this);
  }

  public void leggTilUvenn(Person uvenn){
    mittVennesystem.leggTilUvenn(uvenn);
  }

  public void skrivUtVennesystem(){
    System.out.println(navn + " SITT VENNESYSTEM:");
    mittVennesystem.skrivUt();
  }

  public void bliVenn(Person venn){
    mittVennesystem.bliVenn(venn);
  }
}
