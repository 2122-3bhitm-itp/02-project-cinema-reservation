package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Ticket;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TicketRepository implements Persistent<Ticket> {

    private final DataSource dataSource = Database.getDataSource();
    @Override
    public void save(Ticket entity) {
        if (entity.getSeat() == null) {
            insert(entity);
        } else {
            update(entity);
        }
    }

    public void update(Ticket entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Ticket entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
