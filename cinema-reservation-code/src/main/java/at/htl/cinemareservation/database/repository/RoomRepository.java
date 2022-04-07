package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Room;

import java.util.List;

public class RoomRepository implements Persistent<Room> {
    @Override
    public void save(Room entity) {

    }

    @Override
    public void insert(Room entity) {

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
