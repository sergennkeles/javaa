package eCommerceDemo.services.google;

import java.util.ArrayList;
import java.util.List;


public class LoginWithGoogle {
	
	static List<Google> googleAccounts;
	
	public LoginWithGoogle() {
		
		googleAccounts=new ArrayList<>();
		googleAccounts.add(new Google("Sergen", "Keleþ", "sergen.keles.58@gmail.com", "12345"));
	}

	public boolean login(String mail,String password) {
		if (find(mail)!=null && find(mail).getPassword().equals(password)) {
			
			return true;
		}
		return false;
	}
	
	public Google find(String mail) {
		Google gmail=LoginWithGoogle.googleAccounts.stream()
				.filter((user)->user.getMail().equals(mail))
				.findFirst()
				.orElse(null);
		return gmail;
	}
}
