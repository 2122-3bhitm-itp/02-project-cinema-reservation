package at.htl.cinemareservation.model;

public class Seat {
    private int nr;
    Row row;

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setRow(Row row) {
        this.row = row;
    }

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
