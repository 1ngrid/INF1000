import java.util.*;

class Oppg4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a;
		int b; 
		System.out.println("Gi en verdi for a: ");
		a = scan.nextInt();
		System.out.println("Gi en verdi for b: ");
		b = scan.nextInt();

		if (a > b) {
			System.out.println("a er storre enn b"); 
		} else {
			System.out.println(" a er ikke storre enn b"); 
		}
	}
}
