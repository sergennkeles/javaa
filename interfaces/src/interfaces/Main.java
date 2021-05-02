package interfaces;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Sergen");
		customer.setLastName("Keleþ");

		Customer customer2=new Customer(2,"Engin","Demiroð");
		CustomerManager customerManager=new CustomerManager(new SmsLogger(),new FileLogger(),new DatabaseLogger());

		customerManager.add(customer);
		customerManager.delete(customer2);
	}

}
