package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.Seller;

public interface SellerDao {
	
	List<Seller> getAll();
	Seller get(int id);
	void add(Seller seller);
	void update(Seller seller);
	void delete(Seller seller);
}
