package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Presentation;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

            //insert into database

            String sql = "UPDATE Presentation SET STARTTIME = ?, ROOM_ID= ?, MOVIE_ID =?) where PRESENTATION_ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setDate(1,entity.getStartTime());
            statement.setInt(2,entity.getRoom().getRoomNumber());
            statement.setLong(3,entity.getMovie().getId());
            statement.setInt(4,entity.getId());

            if (statement.executeUpdate() == 0) {
                throw new SQLException("update failed!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Presentation entity) {
        try (Connection connection = dataSource.getConnection()) {

            //insert into database
            String sql = "insert into Presentation (STARTTIME, ROOM_ID, MOVIE_ID) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setDate(1,entity.getStartTime());
            statement.setInt(2,entity.getRoom().getRoomNumber());
            statement.setLong(3,entity.getMovie().getId());

            if (statement.executeUpdate() == 0) {
                throw new SQLException("insert failed!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "DELETE FROM Presentation  WHERE PRESENTATION_ID=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);


            if (statement.executeUpdate() == 0) {
                throw new SQLException("failed to delete Presentation");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

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
