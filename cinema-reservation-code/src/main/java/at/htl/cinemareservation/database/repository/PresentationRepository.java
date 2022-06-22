package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Presentation;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PresentationRepository implements Persistent<Presentation> {

    private final DataSource dataSource = Database.getDataSource();

    @Override
    public void save(Presentation entity) {
        if (entity.getId() == 0) {
            insert(entity);
        } else {
            update(entity);
        }
    }

    public void update(Presentation entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
                e.printStackTrace();
        }
    }

    @Override
    public void insert(Presentation entity) {
        try (Connection connection = dataSource.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Presentation> findAll() {
        return null;
    }

    @Override
    public Presentation findById(long id) {
        return null;
    }
}
