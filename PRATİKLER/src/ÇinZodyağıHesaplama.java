import java.util.Scanner;

public class ÇinZodyağıHesaplama {

	public static void main(String[] args) {
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Doğum Yılınızı Giriniz: ");
		int age=input.nextInt();
		int result=age%12;
		String message="Çin zodyağı burcubuz";
		String animal="";
		
		//diğer yol
		switch (result) {
		case 0:
			animal="maymun";
			break;
		case 1:
			animal="horoz";
		case 2:
			animal="köpek";
		
		}
		System.out.println("Çin zodyağı burcunuz:"+animal);
	}
}
