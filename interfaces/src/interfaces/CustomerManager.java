package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger... loggers) {
		// Logger... buradaki 3 nokta kullan�m� c# daki params keyword�ne benzer i�lev g�r�yor.
		// 3 nokta sayesinde istedi�imiz kadar parametre yollayabiliyoruz.
		this.loggers=loggers;
	}
	
	public void add(Customer customer)
	{
		System.out.println("M��teri eklendi: "+customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName()); // static olarak belirlenen methodlar� �a��r�rken s�n�f�n
		// ad�yla �a��rabiliriz. Bu y�ntem bizi class'� newlemekten kurtar�r. Bu tasar�m modeli s�rekli 
		// kullan�lacak methodlar� bellekte daimi tutmak i�in kullan�yoruz.
	}
	
	public void delete(Customer customer)
	{
		System.out.println("M��teri silindi: "+customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName());
	}
	
}
