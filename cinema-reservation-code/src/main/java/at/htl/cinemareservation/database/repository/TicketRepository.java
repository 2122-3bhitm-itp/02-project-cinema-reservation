package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Database;
import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Ticket;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

            //insert into database
            String sql = "insert into TICKET (SEAT_ID, ROW_ID, ROOM_ID, PRESENTATION_ID) values (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setLong(1,entity.getSeat().getNr());
            statement.setInt(2,entity.getSeat().getRow().getNr());
            statement.setInt(3,entity.getPresentation().getId());

            if (statement.executeUpdate() == 0) {
                throw new SQLException("insert failded!");
            }

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
