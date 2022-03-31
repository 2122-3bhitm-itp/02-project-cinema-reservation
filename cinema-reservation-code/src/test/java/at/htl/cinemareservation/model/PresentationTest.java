package at.htl.cinemareservation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PresentationTest {

    @Test
    void createPresentation() {
        //arrange
        Presentation presentation01 = new Presentation(LocalDateTime.of(2022, 4, 30, 15, 56));

        //act

        //assert
        assertThat(presentation01.getStartTime().isEqual(LocalDateTime.of(2022, 4, 30, 15, 56)));
    }

}