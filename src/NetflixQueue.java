
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Collections;

public class NetflixQueue {
	public static void main(String[] args) {

		Movie m1 = new Movie("cow the first", 3343);
		Movie m2 = new Movie("cow the second", 18123);
		Movie m3 = new Movie("cow the third", 12123444);
		Movie m4 = new Movie("cow the fourth", 11111);
		Movie m5 = new Movie("cow the fofth", 7654);

		m1.getTicketPrice();
		m2.getTicketPrice();
		m3.getTicketPrice();
		m4.getTicketPrice();
		m5.getTicketPrice();

		NetflixQueue netflix = new NetflixQueue();

		netflix.addMovie(m1);
		netflix.addMovie(m2);
		netflix.addMovie(m3);
		netflix.addMovie(m4);
		netflix.addMovie(m5);

		netflix.printMovies();

		System.out.println(netflix.getBestMovie());
		System.out.println(netflix.getBestMovie2());
	}

	ArrayList<Movie> movies = new ArrayList<Movie>();

	public Movie getBestMovie() {
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public Movie getBestMovie2() {
		this.sortMoviesByRating();
		return movies.get(1);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public Movie getMovie(int movieNumber) {
		if (movieNumber < movies.size())
			return movies.get(movieNumber);
		else
			System.err.println(
					"That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}

	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}

}
