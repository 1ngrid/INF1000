import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class StudentSystem{
  HashMap<String, Student> studentOversikt = new HashMap<String, Student>();

  public void lesFil(String filnavn) throws Exception{
    Scanner innfil = new Scanner(new File(filnavn));
    String fag = "";
    while (innfil.hasNext()){
      String linje = innfil.nextLine();
      if (linje.startsWith("*")){
        fag = linje;
      }else{
        if (studentOversikt.containsKey(linje)){
          //studenten finnes fra for, legger til faget:
          Student s = studentOversikt.get(linje);
          // Legger til faget.
          s.leggTilFag(fag);
        }else{
          // Lager en ny student
          Student nyStudent = new Student(linje);
          // legger til faget.
          nyStudent.leggTilFag(fag);
          studentOversikt.put(linje, nyStudent);
          System.out.println("lagt til student");
        }
      }
    }
  }

  public void printAlle(){
    for (Student s : studentOversikt.values()){
      System.out.println(s);
      ArrayList<String> fag = s.hentFag();
      for (String emne : fag){
        System.out.println(emne);
      }

    }
  }
}
