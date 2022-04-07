package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Ticket;

import java.util.List;

public class TicketRepository implements Persistent<Ticket> {
    @Override
    public void save(Ticket entity) {

    }

    @Override
    public void insert(Ticket entity) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }

    @Override
    public Ticket findById(long id) {
        return null;
    }
}
