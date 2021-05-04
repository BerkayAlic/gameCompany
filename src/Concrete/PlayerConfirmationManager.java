package Concrete;

import Abstract.PlayerConfirmationService;
import Entity.Player;

public class PlayerConfirmationManager implements PlayerConfirmationService {

	@Override
	public boolean save(Player player) {
		
		return true;
	}

}
