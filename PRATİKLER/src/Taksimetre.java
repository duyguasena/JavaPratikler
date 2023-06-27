import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Km verisini giriniz");
		double km=input.nextDouble();
		double price=10+(km*2.20);
		
		
		price=(price<20)?20:price;  //ternary operatörü
		
		
	}

}
