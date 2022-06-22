package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Row;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class RowRepository implements Persistent<Row> {

    private final DataSource dataSource = Database.getDataSource();

    @Override
    public void save(Row entity) {
        if (entity.getRoom() == null) {
            insert(entity);
        } else {
            update(entity);
        }
    }
    public void update(Row entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insert(Row entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Row> findAll() {
        return null;
    }

    @Override
    public Row findById(long id) {
        return null;
    }
}
