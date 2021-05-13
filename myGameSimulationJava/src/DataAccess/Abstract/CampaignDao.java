package DataAccess.Abstract;

import Entities.Concrete.Campaign;

public interface CampaignDao {

	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete (Campaign campaign);
}
