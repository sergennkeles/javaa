package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.GamerDao;
import Entities.Concrete.Gamer;

public class InMemoryDao implements GamerDao {

	List<Gamer> gamers;
	
	
	public InMemoryDao() {
	  gamers=new ArrayList<>();
	}

	@Override
	public void add(Gamer gamer) {
	
		this.gamers.add(gamer);
	}

	@Override
	public void update(Gamer gamer) {
		
		// kimlik doðrulamasý yapýlan bir ortamda update olmasa da olur sanýrým :) yine de yapalým.
		Gamer updateGamer=gamers.stream().filter((x)->x.getId()==gamer.getId()).findFirst().orElse(null);
		
		updateGamer.setId(gamer.getId());
		updateGamer.setFirstName(gamer.getFirstName());
		updateGamer.setLastName(gamer.getFirstName());
		updateGamer.setNationalityId(gamer.getNationalityId());
	}

	@Override
	public void delete(Gamer gamer) {
		Gamer deleteGamer=gamers.stream().filter((x)->x.getId()==gamer.getId()).findFirst().orElse(null);
		this.gamers.remove(deleteGamer);
		
	}

}
