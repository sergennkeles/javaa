package eCommerceDemo.core;

import java.util.Random;

public class VerificationMailSender implements MailSender {

	@Override
	public String send(String mail) {
		
		Random rnd=new Random();
		String code=String.valueOf(rnd.nextInt(1000));
		System.out.println("Merhaba "+mail+"\nOnay kodunuz: "+code);
		return code;

	}

}
