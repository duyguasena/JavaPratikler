import java.util.Scanner;

public class Hipotenüs {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("1.kenari giriniz ");
		int a=input.nextInt();
		System.out.println("2.kenari giriniz ");
		int b=input.nextInt();
		
		double c=Math.sqrt((a*a)+(b*b));
		
		System.out.println("Hipotenus :"+(int)c);

	}

}

