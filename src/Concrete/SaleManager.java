package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale, Campaign campaign, Game game) {
		System.out.println("Campaign name is" + campaign.getCampaignName());
		System.out.println("Campaign has been applied to" + game.getName());
		System.out.println("The new price of the game is" +
		(game.getPrice()-(game.getPrice() * campaign.getDiscountPercentage() / 100)));
		
	}

	@Override
	public void update(Sale sale, Campaign campaign, Game game) {
		System.out.println("Sale information has been updated");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Sale information has been removed");
		
	}

}
