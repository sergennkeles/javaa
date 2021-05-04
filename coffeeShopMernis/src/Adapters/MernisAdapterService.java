package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterService implements CustomerCheckService {

	@Override
	public boolean checkCustomer(Customer customer)  {
		
		 KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		 boolean result=false;
	 try {
		
			 result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()) , 
					customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
			
			System.out.println("Do�rulama: "+(result ? "Ba�ar�l�":"Ba�ar�s�z"));
	 	}
	 
	 catch (NumberFormatException | RemoteException e) {
		e.printStackTrace();
	}
		
		return result;
	}

}
