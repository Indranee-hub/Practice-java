package service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import constants.Types;
import models.Customer;
import models.Movie;
import models.MovieFactory;
import models.RentedMovies;

public class MovieRentalService {
	public static Map<String, Movie> movies = new HashMap<>();

	public static String generateStatement(Customer customer) {
		movies.put("F001", MovieFactory.CreateMovie(Types.REGULAR, "You've Got Mail"));
		movies.put("F002", MovieFactory.CreateMovie(Types.REGULAR, "Matrix"));
		movies.put("F003", MovieFactory.CreateMovie(Types.CHILDREN, "Cars"));
		movies.put("F004", MovieFactory.CreateMovie(Types.NEW, "Fast & Furious X"));

		{
			double totalCost = 0;
			int totalBonusPoint = 0;
			StringBuilder statement = new StringBuilder();
			statement.append("Rental Record for " + customer.getName() + "\n");

			for (RentedMovies rentedMovie : customer.getRentedMovies()) {
				double cost = 0;
				int bonusPoint = 0;
				try {
					cost += movies.get(rentedMovie.getMovieId()).getCost(rentedMovie.getDays());
					bonusPoint += movies.get(rentedMovie.getMovieId()).getBonus(rentedMovie.getDays());
					statement
							.append("\t" + movies.get(rentedMovie.getMovieId()).getTitle() + "\t" + cost + "\n");
					totalCost += cost;
					totalBonusPoint += bonusPoint;
				} catch (Exception e) {
					System.out.println("Error Handling MovieId:" + rentedMovie.getMovieId());
					System.out.println(e.getMessage());
				}

			}
			statement.append(
					"Amount owed is " + totalCost + "\n" + "You earned " + totalBonusPoint + " frequent points\n");

			return statement.toString();

		}

	}
}
