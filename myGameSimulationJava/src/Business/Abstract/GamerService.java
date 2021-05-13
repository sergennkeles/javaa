package Business.Abstract;

import java.util.List;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public interface GamerService {
	
	List<Gamer> GetAllGamer();

    void Add(Gamer gamer,Game game,Campaign campaign);
}
