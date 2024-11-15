package _7_class_components;

public class Movie {
    int id; // instance variable
    String title;
    String description;
    int releaseYear;

    // local variable and instance variable both are having same name
    public void setId(int id /*local variable*/){
        id = id;// local variable value is getting assigned to itself

        // differentiated both local and instance variable
        // assigning local variable value to instance variable
        this.id = id;
    }
    public void setTitle(String t){
        title = t;//assigning local to instance variable since both are having different name
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(1001);
        System.out.println(movie.id);//
    }
}
