package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity {

	private String campaignName;

	public Campaign()
	{
		
	}
	public Campaign(String campaignName) {
		super();
		this.campaignName = campaignName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}
