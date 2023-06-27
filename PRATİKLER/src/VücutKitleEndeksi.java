import java.util.Scanner;

public class VücutKitleEndeksi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu metre cinsinden giriniz:");
		double boy=input.nextDouble();
		
		System.out.println("Lutfen kilonuzu giriniz:");
		int kilo=input.nextInt();
		
		double indeks=kilo/(boy*boy);
		
		System.out.println("Vucut kitle indeksiniz:"+indeks);
		
		if(indeks<18.5)
		{
			System.out.println("zayıf");
		}
		else if(18.5<=indeks&& 24.9>=indeks)
		{
			System.out.println("ideal");
		}
		else if(25<=indeks&& 29.9>=indeks)
		{
			System.out.println("şişman");
		}
		else if(30<=indeks&& 34.9>=indeks)
		{
			System.out.println("obez");
		}
		else if(indeks>=35) 
		{
			System.out.println("aşırı obez");
		}
	}

}
