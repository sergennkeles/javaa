package Adapters;

import Business.Abstract.CheckRealPersonService;
import Entities.Concrete.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterService implements CheckRealPersonService {

	@Override
	public boolean checkRealPerson(Gamer gamer) {
		 KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		 boolean result=false;
	 try {
		
			 result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()) , 
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthYear().getYear());
			
			System.out.println("Doğrulama: "+(result ? "Başarılı":"Başarısız"));
	 	}
	 
	 catch (Exception e) {
		
		 e.printStackTrace();
	}
		
		return result;
	}
	

}
