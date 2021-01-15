
public class CellePhone {
String phone="Samsung";
	public static void main(String[] args) {

		
		
		CellePhone  cellePhone =new CellePhone();
		CellePhone.Iphone.Iphone10 iphone=new CellePhone.Iphone.Iphone10();
		
		System.out.println(iphone.phone);
		System.out.println(cellePhone.phone);

	}
 public static class Iphone {
	 
		String phone="iphone 10";

		public static class Iphone10 {
			 
			String phone="iphone 100";

		 
	 }
 }
}
