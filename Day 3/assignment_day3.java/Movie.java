
public class Movie {
    private String moviename;
    private String director;
    private double rating;
	public Movie(String moviename, String director, double rating) {
		super();
		this.moviename = moviename;
		this.director = director;
		this.rating = rating;
	}
	/**
	 * @return the moviename
	 */
	public String getMoviename() {
		return moviename;
	}
	/**
	 * @param moviename the moviename to set
	 */
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", director=" + director + ", rating=" + rating + "]";
	}
    
    
    
}
