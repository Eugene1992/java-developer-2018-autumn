package java_essential.incapsulation;

public class FilmTest {
    public static void main(String[] args) {
        Film film = new Film("Forest Gamp", 1994, 55_000_000);
        System.out.println(film.getTitle());

        film.setReleaseYear(1995);
        film.setReleaseYear(1994);

        Film greenMile = new Film("Green Mile");


    }
}
