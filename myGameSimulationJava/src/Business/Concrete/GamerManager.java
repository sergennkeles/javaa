package Business.Concrete;

import java.util.List;

import Business.Abstract.CampaignService;
import Business.Abstract.GameService;
import Business.Abstract.GamerService;
import DataAccess.Abstract.GamerDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public class GamerManager implements GamerService {

	GamerDao gamerDao;
	private ServiceInjectManager services;

	public GamerManager(GamerDao gamerDao,ServiceInjectManager services) {
		super();
		this.gamerDao = gamerDao;
		this.services=services;

	}

	@Override
	public List<Gamer> GetAllGamer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Add(Gamer gamer, Game game, Campaign campaign) {

		if (this.services.checkRealPersonService.checkRealPerson(gamer)) {
			this.gamerDao.add(gamer);
			System.out.println(gamer.getFirstName() + " adlý oyuncu için " + game.getGameName() + " adlý oyun "
					+ campaign.getCampaignName() + " kampanyasý uygulanmýþtýr.");
		}
		else {
			System.out.println("Doðrulanamayan oyuncu!");
		}
		

	}

}
