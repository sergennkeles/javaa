package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity {

	private String gameName;

	public Game(String gameName) {
		super();
		this.gameName = gameName;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
