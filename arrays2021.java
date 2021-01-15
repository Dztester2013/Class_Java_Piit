import java.util.Scanner;

public class arrays2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 1, 7, -4, 7, 6, 7, 8, 9, 7, 12, 15, 7 };
		int tmp = 0;
		// System.out.println(tab1.length);
		Scanner input = new Scanner(System.in);
		System.out.println("enter  nember  you are loking for :");
		int number = input.nextInt();

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == number) {
				System.out.println("number " + number + " repeated on  tab[" + i + "]");

				tmp++;
			}
		}
		if (tmp == 0) {
			System.out.println(number + " Doesn't existe in our array");
		} else {
			System.out.print("total repeat is : " + tmp + "times ");
		}
		/*
		 *
		 * if (tab[i]>tab[j])
		 * 
		 * {
		 * 
		 * tmp=tab[j]; tab[j]=tab[i]; tab[i]=tmp; }
		 *
		 *
		 *
		 *
		 */

	}

}
