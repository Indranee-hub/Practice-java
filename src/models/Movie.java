package models;

import constants.Types;

public abstract class Movie {
	
	private String title;
	private Types type;
	public abstract double getCost(int days);
	public abstract double getBonus(int days);
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the type
	 */
	public Types getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Types type) {
		this.type = type;
	}
}
