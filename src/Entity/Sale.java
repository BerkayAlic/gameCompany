package Entity;

import Abstract.Entity;

public class Sale implements Entity {
	private int id;
	//private double priceAfterDiscount;
	private int gameId;
	private int playerId;
	private int campaingId;
	
	public Sale() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	

	public Sale(int id, int gameId, int playerId, int campaingId) {
		super();
		this.id = id;
		//this.priceAfterDiscount = priceAfterDiscount;
		this.gameId = gameId;
		this.playerId = playerId;
		this.campaingId = campaingId;
	}
}
