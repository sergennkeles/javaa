package eCommerceDemo.core;

import eCommerceDemo.services.google.LoginWithGoogle;

public class LoginWithGoogleAdapter implements LoginWithGoogleService {

	@Override
	public boolean login(String mail, String password) {
		 LoginWithGoogle loginWithGmail = new LoginWithGoogle();
	        return loginWithGmail.login(mail,password);
	}

}
