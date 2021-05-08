package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users;


	public HibernateUserDao() {

		this.users = new ArrayList<>();

	}

	@Override
	public List<User> getAll() {

		for (User user : users) {
			System.out.println(user.getEmail());
		}
		return null;
	}

	@Override
	public User get(int id) {

		User userToReturn = null;
		for (User user : this.users) {
			if (user.getId() == id) {
				userToReturn = user;
				break;
			}
		}
		return userToReturn;

	}

	@Override
	public void add(User user) {

		this.users.add(user);
		System.out.println("Hibernate ile Kullanýcý veritabanýna eklendi: " + user.getEmail());


	}

	@Override
	public void update(User user) {

		User updateUser = this.users.stream().filter((x) -> x.getId() == user.getId()).findFirst().orElse(null);

		updateUser.setId(user.getId());
		updateUser.setFirstName(user.getFirstName());
		updateUser.setLastName(user.getLastName());
		updateUser.setEmail(user.getEmail());
		updateUser.setPassWord(user.getPassWord());

	}

	@Override
	public void delete(User user) {

		User userToReturn = null;
		for (User user1 : this.users) {
			if (user1.getId() == user.getId()) {
				userToReturn = user;
				break;
			}
		}
		this.users.remove(userToReturn);
		System.out.println("Kullanýcý silindi.");

	}

	@Override
	public User getByMail(String mail) {

		User checkUserMail = this.users.stream().filter((user) -> user.getEmail().equals(mail)).findFirst()
				.orElse(null);
		return checkUserMail;
	}

	@Override
	public boolean isVerify(User user) {

		User userTocheck = get(user.getId());
		return userTocheck.isVerify() ? true : false;
	}


}
