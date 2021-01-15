
	import java.util.Scanner;

	/**
	 * Cette classe permet d'afficher une valeur à partir d'un tableau
	 * tout en affichant quelques valeurs à droit et à gauche.
	 * Cette classe démontre un cas réel de l'utilisation d'un parcour 
	 * circulaire d'un tableau.
	 */

	public class AffichageCirculaire {
	    
	    // Les valeurs
	    public static int[] ROULETTE = new int[] { 0, 32, 15, 19, 4, 21, 2, 
	        25, 17, 34, 6, 27, 13, 
	        36, 11, 30, 8, 23, 10, 
	        5, 24, 16, 33, 1, 20, 
	        14, 31, 9, 22, 18, 29, 
	        7, 28, 12, 35, 3, 26 };
	        
	        // Le nombre des nombres à droite et à gauche à afficher
	        public static int COMBIEN_AFFICHER = 9;
	    
	    public static void main (String args[]) {
	        
	        Scanner s = new Scanner(System.in);
	        int position = s.nextInt();
	        
	        if(position < 0 || position > 36){
	            System.out.println("Position incorrecte");
	        }else{
	            int indice = (position - COMBIEN_AFFICHER + 37) % 37;
	            
	            for(int i = 0; i < COMBIEN_AFFICHER * 2 + 1; i++){
	                System.out.format("%02d ", ROULETTE[indice]);
	                indice = (indice + 1) % 37;
	            }
	            
	            System.out.println("ss");
	            
	            // Un peu de décoration
	            for(int i = 0; i < COMBIEN_AFFICHER * 2 + 1; i++){
	                if(i == COMBIEN_AFFICHER)
	                    System.out.print("^");
	                else
	                    System.out.print("   ");
	            }
	            
	        }
	            
	    }
	}



