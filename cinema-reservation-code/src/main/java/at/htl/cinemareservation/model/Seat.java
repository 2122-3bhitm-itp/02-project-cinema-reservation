package at.htl.cinemareservation.model;

public class Seat {
    private int nr;
    Row row;
    public Seat(Row row, int nr) {
        this.row = row;
    }

    public Row getRow() {
        return row;
    }

    public int getPlace() {
        return nr;
    }
}
