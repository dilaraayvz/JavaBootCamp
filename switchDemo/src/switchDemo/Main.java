package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade='E';
		
		switch (grade) {
		case 'A': {
			System.out.println("A notu ile gectiniz. Mukemmel");
			break;
		}
		case 'B':{
			System.out.println("B notu ile gectiniz. Guzel");
			break;
		}
		case 'C':{
			System.out.println("C notu ile gectiniz. İyi.");
			break;
		}
		case 'D':{
			System.out.println("D notu ile gectiniz. Fena Degil");
			break;
		}
		case 'E':{
			System.out.println("E notu ile KALDINIZ.");
			break;
		}
		default:
		System.out.println("Gecersiz kod girdiniz!!!");
		}
	}

}
