class StringOppgaver{
	public static void main(String[] args){
		
		String tekst = ("Hallo gruppe 8"); 

		// Print ett ord paa hver linje
		
		String[] a = tekst.split(" ");
		for (int i = 0; i < a.length; ++i){
		    System.out.println(a[i]);
		}

		// Print en bokstav paa hver linje

		for (int i = 0; i < tekst.length(); i++){
		    System.out.println(tekst.charAt(i));
		}

		for(int i = 0; i< a.length; i++){
		    String s = a[i];
		    for (int j = 0; j < s.length(); j++){
			System.out.println(s.charAt(j));
		    }

		}

	}
}
