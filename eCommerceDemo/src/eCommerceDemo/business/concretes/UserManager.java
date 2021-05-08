package eCommerceDemo.business.concretes;



import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {

    private static final Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
	UserDao user;

	
	public UserManager(UserDao user) {
		super();
		this.user = user;
	}

	@Override
	public void add(User user) {

			this.user.add(user);
	}

	@Override
	public List<User> getAll() {

		return this.user.getAll();		
	}


	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return this.user.get(id);
	}

	@Override
	public void update(User user) {
		this.user.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.user.delete(user);
		
	}

	@Override
	public void verificate(User user) {
		user.setVerify(true);
		
	}

	@Override
	public boolean checkToMail(String mail) {
		
	    Matcher matcher = pattern.matcher(mail);
	    boolean matchFound = matcher.find();
	    return matchFound;
	}

	@Override
	public User getByMail(String mail) {
		User foundedUser=this.user.getByMail(mail);
		return foundedUser;
	}

	@Override
	public boolean isVerify(User user) {
		// TODO Auto-generated method stub
		return this.user.isVerify(user);
	}


}
