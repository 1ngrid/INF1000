import java.util.Scanner;

public class Arrayer{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] tall = new int[5]; 

		//	for(int pos = 0; pos < tall.length; pos++){
		int pos = 0; 
		while(pos < tall.length) {
			System.out.println("Skriv inn et tall:");
			tall[pos] = Integer.parseInt(in.nextLine());
			pos++; 
		}

		storsteTall(tall);
		minsteTall(tall);
	}
	// print storste tallet i arrayen
	static void storsteTall(int[] array) {
		int storste = 0; 
		for (int i = 0; i < array.length; i++){
			if(array[i] > storste) {
				storste = array[i]; 
			}
		}
		System.out.println("Storste tall: " + storste);
	}

	// print minste tallet i arrayen
	static void minsteTall(int[] array) {
		int minste = 1000; // Integer.MAX_VALUE
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minste) {
				// har funnet nytt tall som er mindre
				minste = array[i]; 
			}
		}
		System.out.println("Minste tallet:" + minste);
	}
}
