package models;

import constants.Types;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		this.setTitle(title);
		this.setType(Types.REGULAR);
	}

	@Override
	public double getCost(int days) {
		double cost = 2;
		if (days > 2) {
			cost = ((days - 2) * 1.5) + cost;
		}
		return cost;
	}

	@Override
	public double getBonus(int days) {
		return 1;
	}

}
