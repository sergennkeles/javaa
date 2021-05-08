import java.rmi.RemoteException;
import java.sql.Date;
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisAdapterService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {


	public static void main(String[] args) throws Exception {

		Customer customer = new Customer();
		customer.setFirstName("SERGEN");
		customer.setLastName("KELEÞ");
		customer.setDateOfBirth(new Date(1991, 9, 02));
		customer.setNationalityId("11111111111");

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisAdapterService());
		baseCustomerManager.save(customer);
		BaseCustomerManager baseCustomerManager1 = new NeroCustomerManager();

	}
}
