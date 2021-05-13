package Business.Concrete;

import Business.Abstract.CheckRealPersonService;
import Entities.Concrete.Gamer;

public class CheckRealPersonManager implements CheckRealPersonService{

	@Override
	public boolean checkRealPerson(Gamer gamer) {
		
		return false;
	}

}
