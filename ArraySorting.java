
public class ArraySorting {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] tab = { 1, 7, -4, 74, 6, 37, 8, 9, 77, 12, 15, 97 };
			int tmp = 0;
			// System.out.println(tab1.length);
			

			for (int i = 0; i < tab.length; i++) {
			for (int j = i+1; j < tab.length; j++) {
	
			 if (tab[i]>tab[j])
			  
			  {
			 
			  tmp=tab[j]; 
			  tab[j]=tab[i]; 
			  tab[i]=tmp; 
			  }
}			 System.out.print(tab[i]+",");

		}

	}

}
