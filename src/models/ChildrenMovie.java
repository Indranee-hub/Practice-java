package models;

import constants.Types;

public class ChildrenMovie extends Movie {
	public ChildrenMovie(String title) {
		this.setTitle(title);
		this.setType(Types.CHILDREN);
	}

	@Override
	public double getCost(int days) {
		double cost = 1.5;
		if (days > 3) {
			cost = ((days - 3) * 1.5) + cost;
		}
		return cost;
	}

	@Override
	public double getBonus(int days) {
		// TODO Auto-generated method stub
		return 1;
	}

}
