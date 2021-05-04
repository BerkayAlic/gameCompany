package gameCompany;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;
import Entity.Sale;

public class Main {

	public static void main(String[] args) {
		
		
		
		Player player1 = new Player();
		player1.setId(1);
		player1.setName("Berkay");
		player1.setSurName("Alic");
		player1.setTcNo("1907041");
		player1.setDateOfBirth(1995);
		
		Campaign campaign1 = new Campaign(1,"Noel",35);
		Game game1 = new Game(1,"CsGo", 15);
		Sale sale1 = new Sale(1,1,1,1);
		
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		SaleManager saleManager = new SaleManager();
		
		gameManager.add(game1);
		campaignManager.add(campaign1);
		playerManager.add(player1);
		saleManager.add(sale1, campaign1, game1);
		
		
	}

}
