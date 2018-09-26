package java_essential.incapsulation;

import java.util.Scanner;

public class Film {
    private String title;
    private int releaseYear;
    private int budget;
    private static Scanner scanner = new Scanner(System.in);

    public Film() {
    }

    public Film(String title) {
        this.title = title;
    }

    public Film(String title, int releaseYear, int budget) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getBudget() {
        return budget;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
