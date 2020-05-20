/**
 * 
 */
package com.tcs.moviecatalog.model;

/**
 * @author Sammy
 *
 */
public class MovieCatalogDto {

	private String movieId;
	private String movieName;
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
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @param movieId
	 * @param movieName
	 */
	public MovieCatalogDto(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "MovieCatalogDto [movieId=" + movieId + ", movieName=" + movieName + ", getMovieId()=" + getMovieId()
				+ ", getMovieName()=" + getMovieName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
