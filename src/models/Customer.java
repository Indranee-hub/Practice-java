package models;

import java.util.List;

public class Customer {
	
	private String name;
	private List<RentedMovies> rentedMovies;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public Customer(String name, List<RentedMovies> rentedMovies) {
		super();
		this.name = name;
		this.rentedMovies = rentedMovies;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rentedMovies
	 */
	public List<RentedMovies> getRentedMovies() {
		return rentedMovies;
	}
	/**
	 * @param rentedMovies the rentedMovies to set
	 */
	public void setRentedMovies(List<RentedMovies> rentedMovies) {
		this.rentedMovies = rentedMovies;
	}


}
