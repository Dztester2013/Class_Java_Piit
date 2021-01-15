import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter length of your Array ");
		int tablength = input.nextInt();
		int[] array = new int[tablength-1];  

		for (int i = 0; i <= array.length - 1; i++) {
			array[i]=input.nextInt();  
			System.out.println(array[i]);
		}
		for (int j=0; j <= array.length - 1; j++)   
		{ 
			 

		System.out.print(array[j]+",");  

		}  

	}

}
