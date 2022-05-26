package models;

import constants.Types;

public class NewMovie extends Movie {

	public NewMovie(String title) {
		this.setTitle(title);
		this.setType(Types.NEW);
	}

	@Override
	public double getCost(int days) {
		return days * 3;
	}

	@Override
	public double getBonus(int days) {
		if (days > 2)
			return 2;
		else
			return 1;
	}

}
