
public class Tab {
public static void main(String[] args) {
	//int[][] tab = new int[][] {{8,5,7},{9,3,2},{4,6,1}};
	//int[][] tab = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	//int[][] tab = new int[][] {{2,9,6},{1,3,7},{4,8,5}};
	//int[][] tab = new int[][] {{1,7,9},{2,4,6},{8,5,3}};
	int[][] tab1= { {1,2,3,4} , {5,1,8,4} };

	/* code manquant */
	int[][] tab2= { {2,3} , {1,4} , {3,5} , {2,5} };
	int[][] tab = new int[tab1.length][tab2[0].length];

	for (int i = 0 ; i < tab1.length; i++){

		for (int j = 0 ; j < tab2[0].length; j++){

			for (int k = 0; k < tab2.length; k++){

				tab[i][j] += tab1[i][k] * tab2[k][j];

		}
			System.out.println(tab[i][j]);	}
	}
}}