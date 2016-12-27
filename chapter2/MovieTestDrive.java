class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println("Film is running");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "First Movie";
        one.genre = "tragedy";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Second Movie";
        two.genre = "comedy";
        two.rating = 5;

        two.playIt();

        Movie three = new Movie();
        three.title = "Third Movie";
        three.genre = "drama";
        three.rating = 127;
    }
}
