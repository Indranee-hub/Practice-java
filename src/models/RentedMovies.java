package models;

public class RentedMovies {
	private String movieId;
	private Integer days;
	
	/**
	 * @return the movieId
	 */
	public String getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	/**
	 * @return the days
	 */
	public Integer getDays() {
		return days;
	}
	/**
	 * @param days the days to set
	 */
	public void setDays(Integer days) {
		this.days = days;
	}
	
	public RentedMovies(String movieId, Integer days) {
		super();
		this.movieId = movieId;
		this.days = days;
	
	}
	
	
}
