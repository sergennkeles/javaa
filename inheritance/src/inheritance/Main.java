package inheritance;

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer sergen=new IndividualCustomer();
		CorporateCustomer hepsiburada=new CorporateCustomer();
		sergen.customerNumber="1234";
		hepsiburada.customerNumber="5678"; 
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add(sergen);
		customerManager.Add(hepsiburada);
		
		System.out.println("--------------");
		Customer[] customers={sergen,hepsiburada};
		
		customerManager.AddMultiple(customers);
	}

}
