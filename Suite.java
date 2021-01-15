import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
		int j ;
		int val;
		for (int i = debut; i <= fin; i++) {
			 j = 0;
			 val = 0;
			if (i % 3 == 0) {
				val = i + 4;
				j = j + 1;

			}
			if (i % 3 != 0 && i % 4 == 0) {
				val = i / 2;
				j = j + 1;

			}
			if (i % 3 != 0 && i % 4 != 0) {
				val = i - 1;
				j = j + 1;

			}
			if (val ==0){
				System.out.println(i+" -> "+j);	}else if (val != 0) {
				
			
				do {

					if (val % 3 == 0) {
						val = val + 4;
						j = j + 1;

					}
					else	if (val % 3 != 0 && val % 4 == 0) {
						val = val / 2;
						j = j + 1;

					}
					else if (val % 3 != 0 && val % 4 != 0) {
						val = val - 1;
						j = j + 1;

					}
				} while (val > 0);
				System.out.println(i+" -> "+j);}  
				
		}

		/*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}