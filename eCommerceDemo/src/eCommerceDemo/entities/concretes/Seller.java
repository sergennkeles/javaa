package eCommerceDemo.entities.concretes;

public class Seller extends User {

	private String companyName;

	public Seller(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
