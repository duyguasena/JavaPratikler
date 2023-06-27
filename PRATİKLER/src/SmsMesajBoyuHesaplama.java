
public class SmsMesajBoyuHesaplama {

	public static void main(String[] args) {
		
		String msg="Kodlama Vakti ekibi olarak  ";
		double smsLengt=(int)Math.ceil(msg.length()/160.0);//bir üste yuvarlama
		System.out.println("mesajınız"+msg.length()+"karakterden oluşuyor ve"+smsLengt+"sms e bölünebilir");
		
	}

}
