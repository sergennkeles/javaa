package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.VerificationService;
import eCommerceDemo.core.LoginWithGoogleService;
import eCommerceDemo.entities.concretes.User;
import eCommerceDemo.services.google.Google;

public class AuthManager implements AuthService {

	private UserService userService;
	private VerificationService verificationService;
	private LoginWithGoogleService googleService;

	public AuthManager(UserService userService, VerificationService verificationService,
			LoginWithGoogleService googleService) {
		this.userService = userService;
		this.verificationService = verificationService;
		this.googleService = googleService;
	}

	@Override
	public boolean login(User user) {
		User usertoCheck = this.userService.getByMail(user.getEmail());
		if (usertoCheck == null) {
			System.out.println("Kay�tl� kullan�c� bulunamad�");
			return false;

		} else if (!user.getPassWord().equals(usertoCheck.getPassWord())) {
			System.out.println("Yanl�� parola ve mail adresi");
			return false;
		} else {
			System.out.println("Merhaba "+user.getFirstName()+" e-ticaret sistemine ho�geldiniz.");
			return true;
		}
	}

	@Override
	public boolean register(User user) {
		// Buray� tek bir if ile ��zebilirdik ama mesajlar� ayr� ayr� g�stermek i�in b�yle yapt�m.
		if (!this.userService.checkToMail(user.getEmail())) {
			System.out.println("L�tfen ge�erli bir mail adresi giriniz.");
			return false;
		}

		if (user.getFirstName().length() < 3 ||  user.getLastName().length() < 3) {
			System.out.println("Kullan�c� ad� veya soyad� 2 karakterden k���k olamaz");
			return false;
		}
	 
		if (user.getPassWord().length() < 6) {
			System.out.println("Kullan�c� parolas� 6 karakterden k���k olamaz");
			return false;
		}
		// Yukar�daki kurallardan ge�erse mail g�nderme i�lemi yap.
		System.out.println("Mail g�nderiliyor...");
		if (!verificationService.verificate(user.getEmail())) {
			System.out.println("Kodu do�ru girmelisiniz!");
			return false;
		}
		System.out.println("Hesab�n�z onayland� ve kayd�n�z yap�ld�.");
		this.userService.add(user);
		return true;
	}

	@Override
	public boolean loginWithGoogle(Google user) {
		if (!this.googleService.login(user.getMail(), user.getPassword())) {
			System.out.println("Bilgileriniz eksik! Gmail ile giri� yap�lamad�.");
			return false;
		}

		System.out.println("Say�n " + user.getFirstName() + " Gmail hesab�n�z ile giri� yap�ld�.");
		return true;

	}

}
