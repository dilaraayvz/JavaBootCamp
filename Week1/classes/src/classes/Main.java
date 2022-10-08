package classes;

public class Main {

	public static void main(String[] args) {
		//reference type 
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		
		//value type
		int sayi1=10;
		int sayi2=25;
		sayi2=sayi1;
		sayi1=5;
		System.out.println(sayi2);
		
		//diziler reference type dır
		int [] sayilar1= {1,2,3};
		int [] sayilar2= {4,5,6};
		
		sayilar2=sayilar1; // sayilar2 artık sayilar1 in referans nosunu tutar.
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);

	}
	

}
