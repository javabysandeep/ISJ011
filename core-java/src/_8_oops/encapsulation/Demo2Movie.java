package _8_oops.encapsulation;

public class Demo2Movie {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(101);
        movie.setYear(2025);
        movie.setDirector("Sandeep Sir");
        movie.setTitle("Java ka Jalwa");

        System.out.println(movie.getId() + " " + movie.getYear() + " "
                + movie.getDirector() + " "
                + movie.getTitle());

        System.out.println(movie.toString());
    }
}
