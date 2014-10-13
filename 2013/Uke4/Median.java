class Median{
    public static void main(String[] args){
	// Array vi skal sortere
	int [] heltall = {1, 8, 4,5,6,9,3};
	// Array som blir sortert
	int[] sortert = new int[heltall.length];
	// Lagrer minste funnet verdi av de vi sorterer
	int min;

	for (int j= 0; j < heltall.length; j++){
		min = heltall[j];
		// Teller fra plass j til enden
	    for (int i = j; i < heltall.length; i++){
			if(heltall[i] < min) {
				// Lagrer den gamle minsteverdien og legger den til 
				// en annen plass i arrayen (slik at den ikke blir borte)
				int tmp = min;
				// Ny minsteverdi blir lagret
				min = heltall[i];
				// Tar vare på den gamle minsteverdien funnet denne runden
				heltall[i] = tmp;
			}
	    }
		sortert[j] = min; 
	}

	for (int i = 0; i < heltall.length; i++){
		System.out.println(sortert[i]);
	}

	int midt = heltall.length/2; // Midten av arrayen (lengden/2)
	int median = sortert[midt];  // Tallet som ligger paa midterste plass
	System.out.println("Medianen av arrayen: " + median);
    }

}
