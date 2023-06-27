import java.util.Scanner;

public class TersÜçgen {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Kaç satır olsun:");
		int number=input.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			System.out.print(i);
		}
		
		
	}

}
