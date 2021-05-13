package DataAccess.Abstract;


import Entities.Concrete.Game;

public interface GameDao {

	void add(Game game);
	void update(Game game);
	void delete (Game game);
}
