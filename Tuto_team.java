import java.util.Scanner;

public class Tuto_team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your First name :");
		String firstName = input.nextLine();
		System.out.print("Enter your Last name :");
		String lastName = input.nextLine();
		System.out.print("Enter your Age :");
		int age = input.nextInt();
		System.out.println("----***---- P O I N T S ----***---- ");
		System.out.print("Java Points :");
		double javaPoints = input.nextDouble();
		System.out.print("Sql  Points :");
		double javaSql = input.nextDouble();
		double moyAvg = (javaPoints + javaSql)/2;
		if (moyAvg>=15)
		{
			System.out.println("Excelent Job   "+ firstName+","+"lastName");
			System.out.println("Your grade is A");
		}else if (moyAvg>=12 && moyAvg<15 )
		{
			System.out.println("good Job !!!   "+ firstName+","+"lastName");
			System.out.println("Your grade is B");
		}else if (moyAvg>=8 && moyAvg<12 )
		{
			System.out.println(" expecting more then that from you "+ firstName+","+"lastName");
			System.out.println("Your grade is C");
		}else if (moyAvg>=4 && moyAvg<8 )
		{
			System.out.println("mmm!!! need more work  "+ firstName+","+"lastName");
			System.out.println("Your grade is D");
		}else if (moyAvg>=0 && moyAvg<4 )
		{
			System.out.println("mmm!!!Failed !!!   "+ firstName+","+"lastName");
			System.out.println("Your grade is F");
		}
	
	
	
	
	}

}
