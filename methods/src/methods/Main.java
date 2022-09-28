package methods;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(topla(2,3));
		
		System.out.println(topla2(1,2,3,4,5));
	}

	//deger dondurmez is yaparsa void kullanılır 
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi.");
		
	}
	public static void guncelle() {
		System.out.println("Guncellendi.");
	}
	
	public static int topla(int a,int b) {
		return a+b;
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		};
		return toplam;
	}
}
