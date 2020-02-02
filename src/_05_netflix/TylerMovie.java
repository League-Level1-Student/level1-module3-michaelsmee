package _05_netflix;

import javax.swing.JOptionPane;

public class TylerMovie {
public static void main(String[] args) {
	
	
	
Movie movie= new Movie("poopo", 0);
Movie tyler = new Movie("tyler's ig habits", 2);
Movie tylerGF = new Movie("tyler's gf phone? idk who made this", 1);
Movie tylerMom = new Movie("tyler's mom car!", -7);
Movie tylerDad = new Movie("Tyler's dads house?", 100);
	
NetflixQueue Tyler = new NetflixQueue();
Tyler.addMovie(movie);
Tyler.addMovie(tyler);	
Tyler.addMovie(tylerGF);	
Tyler.addMovie(tylerMom);	
Tyler.addMovie(tylerDad);	
	
	Tyler.printMovies();
	
Movie poopoTyler = 	Tyler.getBestMovie();
Tyler.sortMoviesByRating();
Movie aksel = Tyler.getMovie(1);
	JOptionPane.showMessageDialog(null, "the best movie is" + poopoTyler);
	JOptionPane.showMessageDialog(null, "the second best movie is" + aksel);
}
	
	
}
