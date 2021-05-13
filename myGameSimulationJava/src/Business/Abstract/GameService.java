package Business.Abstract;

import Entities.Concrete.Game;

public interface GameService {
	
	void add(Game game);
	void update(Game game);
	void delete (Game game);

}
