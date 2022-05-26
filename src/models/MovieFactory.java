package models;

import constants.Types;

public class MovieFactory {
	
	public static Movie CreateMovie(Types type,String title) {
		switch (type)
		{
			case NEW:
				return new NewMovie(title);
			case REGULAR:
				return new RegularMovie(title);
			case CHILDREN:
				return new ChildrenMovie(title);
			default:
				return null;
		}
	}

}
