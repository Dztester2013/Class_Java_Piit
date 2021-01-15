import java.util.Scanner;

class Parachutiste2 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double G = 9.81;
        double v0 = 0.0;
        double t0 = 0.0;
        double vitesse = v0;
        double hauteur = h0;
        double t = t0;
        double accel = G;
        double surface = 2.0;
        boolean parachuteOuvert =false;
        double ht = h0;
        int i = 0;
        int j = 0;
        int k = 0;
 
        double s;
        double q;
        double vt;
        double at;
 
 
        //calcul chute libre
 
        do {
        	 s = surface/masse;       
        	 q = Math.exp(-s*(t-t0));        
        	 vt = ( G/s)*(1-q)+(v0*q);       
        	 ht = h0-(G/s)*(t-t0)-((v0-(G/s))/s)*(1-q);        
        	 at = G -(s*vt);
 
 
        	if( ht > 2500 && !parachuteOuvert){
 
 
        		if(vt >= 343 ) {
        			if(j == 0) {
            		System.out.println("## Felix dépasse la vitesse du son");
            		j = 1;
        			}
            	}
            	if( at < 0.50) {
            		if(k == 0) {
            		System.out.println("## Felix a atteind sa vitesse max");
            		k = 1;
            		}
            	}
        	}
        	else{
        		surface = 25;
        		t0 = t;
        		h0 = ht;
        		v0 = vt;
        		parachuteOuvert = true;
        		if(i == 0 ) {
        			System.out.println("Felix ouvre son parachute");
        			i = 1;
        		}
        	}
 
 
 
 
 
 
        	if(ht >0) {
        	System.out.printf("%.0f, %.4f, %.4f,%.5f\n",t, ht, vt, at);
        	}
 
        	t++;
 
 
 
 
        }while( ht> 0);
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}