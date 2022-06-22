package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Room;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class RoomRepository implements Persistent<Room> {

    private final DataSource dataSource = Database.getDataSource();
    @Override
    public void save(Room entity) {
        if (entity.getRoomNumber() == 0) {
            insert(entity);
        } else {
            update(entity);
        }
    }

    public void update(Room entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Room entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Room> findAll() {
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
