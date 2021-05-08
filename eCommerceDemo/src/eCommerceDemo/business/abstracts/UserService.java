package eCommerceDemo.business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	
	List<User> getAll();
	User get(int id);
	void add(User user);
	void update(User user);
	void delete(User user);
	void verificate(User user);
	boolean checkToMail(String mail);
	User getByMail(String mail);
	boolean isVerify(User user);
	

}
