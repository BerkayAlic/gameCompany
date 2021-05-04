package Concrete;

import Abstract.PlayerConfirmationService;
import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService{

	PlayerConfirmationService playerConfirmationService;
	
	public PlayerManager(PlayerConfirmationService playerConfirmationService) {
		
		this.playerConfirmationService = playerConfirmationService;
	}

	@Override
	public void add(Player player) {
		if(playerConfirmationService.save(player)==true)
		{
			System.out.println("New player is added" + player.getName() + player.getSurName());
		}
		else
		{
			System.out.println("Player can not be added");
		}
		
	}

	@Override
	public void update(Player player) {
		
		System.out.println("Player information has been updated");
		
	}

	@Override
	public void delete(Player player) {
		
		System.out.println("Player has been deleted" + player.getName() + player.getSurName());
		
	}

}
