package at.htl.cinemareservation.model;

public class Seat {
    private long id ;
    private final int row;
    private final int place;

    public Seat(int row, int place) {
        this.row = row;
        this.place = place;
    }

    public int getRow() {
        return row;
    }

    public int getPlace() {
        return place;
    }
}
