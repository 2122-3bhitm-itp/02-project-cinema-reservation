package at.htl.cinemareservation.model;

public class Ticket {
    private Seat seat;
    private final Presentation presentation;

    public Ticket(Seat seat, Presentation presentation) {
        this.seat = seat;
        this.presentation = presentation;
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
