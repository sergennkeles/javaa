package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if(this.customerCheckService.checkCustomer(customer))
		{
			System.out.println("Starbucks customer saved to db: "+ customer.getFirstName());
		}
		else
			
		{
			throw new Exception("Invalid person!");
			
		}
		
		
	}

}
