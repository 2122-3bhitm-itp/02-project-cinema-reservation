package at.htl.cinemareservation.model;

public class Movie {
    private int id ;
    private final int length;
    private final String title;
    private String genre;
    private double price;

    public Movie(int length, String title, String genre, double price) {
        this.length = length;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
