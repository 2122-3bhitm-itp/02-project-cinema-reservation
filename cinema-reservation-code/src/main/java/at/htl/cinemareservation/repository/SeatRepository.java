package at.htl.cinemareservation.repository;

import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Seat;

import java.util.List;

public class SeatRepository implements Persistent<Seat> {
    @Override
    public void save(Seat entity) {

    }

    @Override
    public void insert(Seat entity) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Seat> findAll() {
        return null;
    }

    @Override
    public Seat findById(long id) {
        return null;
    }
}
