package Business.Concrete;

import Business.Abstract.GameService;
import DataAccess.Abstract.GameDao;
import Entities.Concrete.Game;

public class GameManager implements GameService{

	GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		System.out.println(game.getGameName()+" adlý oyun eklenmiþtir.");
		
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}

}
