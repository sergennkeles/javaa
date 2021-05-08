package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.services.google.Google;

public interface AuthService {
	
	boolean login (User user);
	boolean register(User user);
	boolean loginWithGoogle(Google user);

}
