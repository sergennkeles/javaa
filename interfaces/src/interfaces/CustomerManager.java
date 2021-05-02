package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger... loggers) {
		// Logger... buradaki 3 nokta kullanýmý c# daki params keywordüne benzer iþlev görüyor.
		// 3 nokta sayesinde istediðimiz kadar parametre yollayabiliyoruz.
		this.loggers=loggers;
	}
	
	public void add(Customer customer)
	{
		System.out.println("Müþteri eklendi: "+customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName()); // static olarak belirlenen methodlarý çaðýrýrken sýnýfýn
		// adýyla çaðýrabiliriz. Bu yöntem bizi class'ý newlemekten kurtarýr. Bu tasarým modeli sürekli 
		// kullanýlacak methodlarý bellekte daimi tutmak için kullanýyoruz.
	}
	
	public void delete(Customer customer)
	{
		System.out.println("Müþteri silindi: "+customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName());
	}
	
}
