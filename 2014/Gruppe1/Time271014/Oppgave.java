public class Oppgave {
  public static void main(String[] args) throws Exception{
    StudentSystem mittSystem = new StudentSystem();
    mittSystem.lesFil("emner.txt");
    mittSystem.printAlle();
  }
}
