
import java.sql.Date;

import Business.Abstract.GameService;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.GamerManager;
import Business.Concrete.ServiceInjectManager;
import DataAccess.Concrete.InMemoryCampaignDao;
import DataAccess.Concrete.InMemoryDao;
import DataAccess.Concrete.InMemoryGameDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "52207624626", "Sergen", "Keleþ", new Date(1992, 9, 02));
		Game game1 = new Game("Pro Evolution Soccer");
		Game game2 = new Game("Grand Theft Auto 5");
		Campaign campaign1 = new Campaign("Vip");
		Campaign campaign2 = new Campaign("Platinum");
		
		GamerManager gamerManager = new GamerManager(
									new InMemoryDao(), 
									new ServiceInjectManager() // Baþka service'ler inject etmek istersek diye yazýdým.
									
									);

	//	GameService gameService = new GameManager(new InMemoryGameDao());
	//	gameService.add(game);
		
		gamerManager.Add(gamer, game1, campaign2);
	}

}
