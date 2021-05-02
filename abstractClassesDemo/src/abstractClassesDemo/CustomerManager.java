package abstractClassesDemo;

public class CustomerManager {

	BaseDatabaseManager baseDatabaseManager;
	
	public void getCustomer()
	{
		baseDatabaseManager.getData();
	}
}
