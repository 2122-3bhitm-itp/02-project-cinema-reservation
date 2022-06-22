package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Seat;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SeatRepository implements Persistent<Seat> {

    private final DataSource dataSource = Database.getDataSource();
    @Override
    public void save(Seat entity) {
        if (entity.getRow() == null) {
            insert(entity);
        } else {
            update(entity);
        }
    }

    public void update(Seat entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Seat entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
