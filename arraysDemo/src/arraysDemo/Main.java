package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String ogr1="Engin";
		String ogr2="Dilara";
		String ogr3="Salih";
		
		String [] ogrenciler= {ogr1, ogr2, ogr3};
		/*for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}*/
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

}
}
