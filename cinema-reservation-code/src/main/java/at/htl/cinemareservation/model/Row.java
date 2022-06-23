package at.htl.cinemareservation.model;

public class Row {
    private int nr;
    private final Room room;
    private double additionalCharge;

    public Row(Room room, double additionalCharge) {
        this.room = room;
        this.additionalCharge = additionalCharge;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Room getRoom() {
        return room;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
