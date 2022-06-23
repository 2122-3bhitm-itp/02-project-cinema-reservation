package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Movie;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MovieRepository implements Persistent<Movie> {

    private final DataSource dataSource = Database.getDataSource();
    @Override
    public void save(Movie entity) {
        if (entity.getId() == null) {
            insert(entity);
        } else {
            update(entity);
        }
    }

    public void update(Movie entity) {
        try (Connection connection = dataSource.getConnection()) {

            long id = entity.getId();

            String sql = "UPDATE Movie SET  title=?, default_price=?, length=? WHERE movie_id= ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1,entity.getTitle());
            statement.setDouble(2,entity.getPrice());
            statement.setInt(3,entity.getLength());
            statement.setLong(4,id);

            if (statement.executeUpdate() == 0) {
                throw new SQLException("update failded!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insert(Movie entity) {
        try (Connection connection = dataSource.getConnection()) {

            //insert into database
            String sql = "insert into MOVIE (TITLE, DEFAULT_PRICE, LENGTH) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1,entity.getTitle());
            statement.setDouble(2,entity.getPrice());
            statement.setInt(3,entity.getLength());

            if (statement.executeUpdate() == 0) {
                throw new SQLException("insert failded!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {

        try (Connection connection = dataSource.getConnection()) {
            String sql = "DELETE FROM Movie WHERE movie_id=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);

            if (statement.executeUpdate() == 0) {
                throw new SQLException("Delete failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Movie findById(long id) {return null;}

}
