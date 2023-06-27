import java.util.Scanner;

public class BiletFiyatHesaplama {

	public static void main(String[] args) {
		
		
		int km=0;
		int age=0;
		int tripType=1;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Mesafeyi km türünden giriniz: ");
		km=input.nextInt();
		
		System.out.println("Yaşınızı giriniz: ");
		age=input.nextInt();
		
		System.out.println("Yolculuk türünün giriniz: ");
		tripType=input.nextInt();
		
		
		
		
		
		if(km<=0||age<=0||(tripType!=1&& tripType!=2))
		{
			double ticketprice= km*0.10;
			double agediscountRate=0.0;
			
			
			if(age<12)
			{
				agediscountRate=0.50;
			}
			else if(age>=12&&age<=24)
			{
				agediscountRate=0.10;
			}
			else if(age>65)
			{
				agediscountRate=0.30;
			}
			
			
			ticketprice-=ticketprice*agediscountRate;
		
			if(tripType==2)
			{
				ticketprice-=ticketprice*0.20;
				ticketprice*=2;
			}
			System.out.println("toplam tutar:"+ticketprice);
		}
		else {
			System.out.println("Hatalı veri girdiniz:");
		}
		
		
	}

}
