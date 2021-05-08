package eCommerceDemo.business.concretes;

import java.util.Scanner;

import eCommerceDemo.business.abstracts.VerificationService;
import eCommerceDemo.core.MailSender;

public class VerificationManager implements VerificationService {

	private MailSender mailSender;
	
	public VerificationManager(MailSender mailSender) {

		this.mailSender = mailSender;
	}

	@Override
	public boolean verificate(String mail) {
		 String code = "";
	        try{
	            Thread.sleep(1000);
	            code = mailSender.send(mail);
	        }catch (Exception e){
	            System.out.println("HATA!!!");
	        }
	        Scanner scan = new Scanner(System.in); // kullan�c�dan veri almak i�in kullan�l�yor. C# Console.Write gibi d���nebiliriz.
	        System.out.print("L�tfen gelen kodu giriniz: ");
	        String enteredCode = scan.nextLine();
	        if(!code.equals(enteredCode)){
	            return false;
	        }
	        return true;
	}

}
