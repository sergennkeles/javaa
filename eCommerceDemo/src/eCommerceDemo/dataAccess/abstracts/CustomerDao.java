package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.Customer;

public interface CustomerDao {

	List<Customer> getAll();
	Customer get(int id);
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
