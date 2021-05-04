package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("New game has been added" + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("The game has been updated" + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("The game has been deleted" + game.getName());
		
	}

}
