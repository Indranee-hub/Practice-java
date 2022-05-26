package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import models.ChildrenMovie;
import models.NewMovie;
import models.RegularMovie;

public class TestAllMovies {

	RegularMovie regMovie = new RegularMovie("Movie1");
	NewMovie newMovie = new NewMovie("Movie2");
	ChildrenMovie childMovie = new ChildrenMovie("Movie3");

	@Test
	public void getCostForRegularMovie() {
		assertNotEquals(7, regMovie.getCost(4));
	}

	@Test
	public void getCostForNewMovie() {
		assertEquals(18, newMovie.getCost(6),0.0);
	}
	
	@Test
	public void getCostForChildMovie() {
		assertEquals(1.5, childMovie.getCost(3),0.0);
	}
	@Test
	public void getBonusForNewMovie() {
		assertEquals(2, newMovie.getBonus(4),0);
	}

}
