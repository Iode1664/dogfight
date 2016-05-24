package jpu2016.dogfight.controller;

public abstract class UserOrder implements IUserOrder {
	private int player;
	private Order order;

	public Order getOrder() {
		return order;
	}
	
	public UserOrder (int player, Order order){
		
	}
	
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

}
