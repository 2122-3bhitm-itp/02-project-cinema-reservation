package at.htl.cinemareservation.database.repository;

import at.htl.cinemareservation.controller.Persistent;
import at.htl.cinemareservation.model.Movie;

import java.util.List;

public class MovieRepository implements Persistent<Movie> {
    @Override
    public void save(Movie entity) {

    }

    @Override
    public void insert(Movie entity) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }
}
