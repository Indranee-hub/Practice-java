package test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import models.Customer;
import models.RentedMovies;
import service.MovieRentalService;

public class TestMovieRentalApp {
	
	MovieRentalService movieRentalService=new MovieRentalService();
	@Test
    public void totalCostValidation_case1() {
		Customer customer = new Customer("C. U. Stomer",
		Arrays.asList(new RentedMovies("F001",3), new RentedMovies("F002",1)));
        String result = MovieRentalService.generateStatement(customer);
        assertTrue(result.contains("Amount owed is 5.5"));
    }
	
	@Test
    public void totalCostValidation_case2() {
		Customer customer = new Customer("C. U. Stomer2",
		Arrays.asList(new RentedMovies("F001",10), new RentedMovies("F002",10)));
        String result = MovieRentalService.generateStatement(customer);
        assertTrue(result.contains("Amount owed is 28"));
    }
	
	@Test
    public void totalBonusValidation_case1() {
		Customer customer = new Customer("C. U. Stomer2",
		Arrays.asList(new RentedMovies("F001",10), new RentedMovies("F004",10)));
        String result = MovieRentalService.generateStatement(customer);
        assertTrue(result.contains("You earned 3 frequent points"));
    }
	@Test
    public void totalBonusValidation_case2() {
		Customer customer = new Customer("C. U. Stomer2",
		Arrays.asList(new RentedMovies("F001",10), new RentedMovies("F004",10),new RentedMovies("F002",10)));
        String result = MovieRentalService.generateStatement(customer);
        assertTrue(result.contains("You earned 4 frequent points"));
        
    }
	@Test
    public void invalid_movieId_exception() {
		Customer customer = new Customer("C. U. Stomer2",
		Arrays.asList(new RentedMovies("F009",10), new RentedMovies("F004",10),new RentedMovies("F002",10)));
        String result = MovieRentalService.generateStatement(customer);
        assertTrue(result.contains("Error"));
    }
	
	

}