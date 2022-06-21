package at.htl.cinemareservation.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PriceTest {

    @Test
    void createPrice() {
        //arrange
        Presentation presentation = new Presentation(LocalDateTime.of(2022, 4, 30, 15, 56));
        Room room = new Room(10);
        Row row = new Row(room,2.5);
        Price price = new Price(presentation,row,7.5);
        //act
        price.setSpecialPrice(8);
        //assert
        assertThat(price.getSpecialPrice()).isEqualTo(8);
    }

}