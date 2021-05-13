package Business.Concrete;

import Adapters.MernisAdapterService;
import Business.Abstract.CampaignService;
import Business.Abstract.CheckRealPersonService;
import Business.Abstract.GameService;

public class ServiceInjectManager {
	
	GameService gameService;
	CampaignService campaignService;
	CheckRealPersonService checkRealPersonService;
		public ServiceInjectManager()
		{
			gameService=new GameManager(null);
			campaignService= new CampaignManager(null);
			checkRealPersonService=new MernisAdapterService();
		}

}
