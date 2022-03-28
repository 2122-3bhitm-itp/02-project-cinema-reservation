package at.htl.cinemareservation.model;

import java.time.LocalDateTime;

public class Presentation {
    private LocalDateTime startTime;

    public Presentation(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}
