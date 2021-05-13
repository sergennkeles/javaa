package Business.Concrete;

import Business.Abstract.CampaignService;
import DataAccess.Abstract.CampaignDao;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	CampaignDao campaingDao;
	
	public CampaignManager(CampaignDao campaingDao) {

		this.campaingDao = campaingDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaingDao.add(campaign);
		System.out.println(campaign.getCampaignName()+"  kampanyasý eklenmiþtir.");
	}

	@Override
	public void update(Campaign campaign) {
		campaingDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaingDao.delete(campaign);
		
	}

}
