package at.htl.cinemareservation.model;

public class Seat {
    private long id ;
    Row row;
    private final int place;

    public Seat(Row row, int place) {
        this.row = row;
        this.place = place;
    }

    public Row getRow() {
        return row;
    }

    public int getPlace() {
        return place;
    }
}
