package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.GameDao;
import Entities.Concrete.Game;

public class InMemoryGameDao implements GameDao {
	
	List<Game> games;

	public InMemoryGameDao() {

		this.games = new ArrayList<>();
	}

	@Override
	public void add(Game game) {
		games.add(game);
		
	}

	@Override
	public void update(Game game) {
		Game updateGame=games.stream().filter((x)->x.getGameName()==game.getGameName()).findFirst().orElse(null);
		updateGame.setGameName(game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		Game deleteGame=games.stream().filter((x)->x.getGameName()==game.getGameName()).findFirst().orElse(null);
		
		games.remove(deleteGame);
	}

}
