import java.util.Scanner;

public class NotHesaplama {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int fizik,matematik,türkçe,kimya,müzik,tarih;
		double sonuc;
		
		System.out.print("Fizik notunuz:");
		int fizik1=input.nextInt();
		
		System.out.print("Matematik notunuz:");
		int matematik1=input.nextInt();
		
		System.out.print("Turkce notunuz:");
		int türkçe1=input.nextInt();
		
		System.out.print("Kimya notunuz:");
		int kimya1=input.nextInt();
		
		System.out.print("Muzik notunuz:");
		int müzik1=input.nextInt();
		
		System.out.print("Tarih notunuz:");
		int tarih1=input.nextInt();
		
		double sonuc1=(fizik1+matematik1+türkçe1+kimya1+müzik1+tarih1)/6;
		
		System.out.println("Ortalamaniz:"+sonuc1);
	}

}
