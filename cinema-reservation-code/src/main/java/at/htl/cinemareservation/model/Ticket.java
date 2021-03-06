package at.htl.cinemareservation.model;

public class Ticket {
    private long id ;
    private Seat seat;
    private final Presentation presentation;

    public Ticket(Seat seat, Presentation presentation) {
        this.seat = seat;
        this.presentation = presentation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Presentation getPresentation() {
        return presentation;
    }
}
