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
			System.out.println("Kayýtlý kullanýcý bulunamadý");
			return false;

		} else if (!user.getPassWord().equals(usertoCheck.getPassWord())) {
			System.out.println("Yanlýþ parola ve mail adresi");
			return false;
		} else {
			System.out.println("Merhaba "+user.getFirstName()+" e-ticaret sistemine hoþgeldiniz.");
			return true;
		}
	}

	@Override
	public boolean register(User user) {
		// Burayý tek bir if ile çözebilirdik ama mesajlarý ayrý ayrý göstermek için böyle yaptým.
		if (!this.userService.checkToMail(user.getEmail())) {
			System.out.println("Lütfen geçerli bir mail adresi giriniz.");
			return false;
		}

		if (user.getFirstName().length() < 3 ||  user.getLastName().length() < 3) {
			System.out.println("Kullanýcý adý veya soyadý 2 karakterden küçük olamaz");
			return false;
		}
	 
		if (user.getPassWord().length() < 6) {
			System.out.println("Kullanýcý parolasý 6 karakterden küçük olamaz");
			return false;
		}
		// Yukarýdaki kurallardan geçerse mail gönderme iþlemi yap.
		System.out.println("Mail gönderiliyor...");
		if (!verificationService.verificate(user.getEmail())) {
			System.out.println("Kodu doðru girmelisiniz!");
			return false;
		}
		System.out.println("Hesabýnýz onaylandý ve kaydýnýz yapýldý.");
		this.userService.add(user);
		return true;
	}

	@Override
	public boolean loginWithGoogle(Google user) {
		if (!this.googleService.login(user.getMail(), user.getPassword())) {
			System.out.println("Bilgileriniz eksik! Gmail ile giriþ yapýlamadý.");
			return false;
		}

		System.out.println("Sayýn " + user.getFirstName() + " Gmail hesabýnýz ile giriþ yapýldý.");
		return true;

	}

}
