package at.htl.cinemareservation.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MovieTest {

    @Test
    void createMovie() {
        //arrange
        Movie batman = new Movie(150,"Batman","Action",22.22);
        //act
        batman.setPrice(17.99);
        //assert
        assertThat(batman.getPrice()).isEqualTo(17.99);
        assertThat(batman.getGenre()).isEqualTo("Action");
        assertThat(batman.getLength()).isEqualTo(150);
        assertThat(batman.getTitle()).isEqualTo("Batman");
    }

}