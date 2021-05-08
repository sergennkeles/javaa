package eCommerceDemo;

import java.util.List;
import java.util.Scanner;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.AuthManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.VerificationManager;
import eCommerceDemo.core.LoginWithGoogleAdapter;
import eCommerceDemo.core.MailSender;
import eCommerceDemo.core.VerificationMailSender;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.services.google.Google;

public class Main {

	static boolean loggedIn = false;
	static Scanner scan = new Scanner(System.in);
	static AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()),
			new VerificationManager(new VerificationMailSender()), new LoginWithGoogleAdapter());

	public static void main(String[] args) {

		User user1 = new User(1, "Sergen", "Keleþ", "sergen@sergenkeles.com", "123456");
	//	User user2 = new User(2, "Engin", "Demiroð", "engin@engin.com", "12345");
		User user3 = new User(2, "Sergen", "Keleþ", "sergen@sergenkeles.com", "12345678");
		Google gmail=new Google("Sergen", "Keleþ", "sergen.keles.58@gmail.com", "12345");

		UserService userService = new UserManager(new HibernateUserDao());
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()),
				new VerificationManager(new VerificationMailSender()), new LoginWithGoogleAdapter());
	//	userService.add(user1);
	//	userService.add(user2);
		System.out.println("---------KAYIT OLMA---------");
		authManager.register(user1);
		//userService.update(user3);
		
		System.out.println("---------NORMAL GÝRÝÞ---------");
		authManager.login(user3); // kayýtlý olmayan bir kullanýcý verdiðimizde login olmuyor :) Örneðin user3
		System.out.println("---------GMAÝL ÝLE GÝRÝÞ---------");
		authManager.loginWithGoogle(gmail);
		
		userService.getAll();

		
	}
}
