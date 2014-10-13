import easyIO.*;

class MetodeOppgave{
    public static void main(String[] args){

	Hjelpeklasse o = new Hjelpeklasse();
	//	System.out.println(o.metode1(2,3));

	//int sum = o.metode1(2,3);
	//	System.out.println(sum);

	System.out.println(o.sum);

	o.metode2();

    }
}

class Hjelpeklasse{
    // Lag en metode som tar inn to heltall og som summerer disse tallene og returnerer tilbake til Hovedklassen som skriver tallet til skjerm
    int sum; 

    int metode1(int a, int b){
	sum = a + b;
	return sum; 
    }


    // Lag en metode som tar inn to tall fra brukeren (med easyIO) og summerer tallene og gir dem tilbake til brukeren.

    In tast = new In();
    Out skjerm = new Out();

    void metode2(){
	//int a = tast.inInt();
	int a = Integer.parseInt(tast.inLine());
	int b = tast.inInt();
	System.out.println(a+b);
	//return a+b;
    }
}
