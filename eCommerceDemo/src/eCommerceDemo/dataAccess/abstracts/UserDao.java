package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {

	List<User> getAll();
	User get(int id);
	User getByMail(String mail);
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean isVerify(User user);
}
