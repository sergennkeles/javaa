package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.CampaignDao;
import Entities.Concrete.Campaign;

public class InMemoryCampaignDao implements CampaignDao {

	List<Campaign> campaigns;

	public InMemoryCampaignDao() {

		this.campaigns = new ArrayList<>();
	}

	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);

	}

	@Override
	public void update(Campaign campaign) {
		Campaign updateCampaign = campaigns.stream().filter((x) -> x.getCampaignName() == campaign.getCampaignName())
				.findFirst().orElse(null);

		updateCampaign.setCampaignName(campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		Campaign deleteCampaign = campaigns.stream().filter((x) -> x.getCampaignName() == campaign.getCampaignName())
				.findFirst().orElse(null);
		campaigns.remove(deleteCampaign);
	}

}
