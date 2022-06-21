
CREATE TABLE movie (
                    movie_id INT
                        CONSTRAINT MOVIE_PK
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY,
                    title VARCHAR(200) NOT NULL,
                    default_price DOUBLE NOT NULL,
                    length INT NOT NULL
);

CREATE TABLE room (
                    room_id INT NOT NULL PRIMARY KEY
);

CREATE TABLE presentation (
                    presentation_id INT
                        CONSTRAINT PRESENTATION_PK
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY,
                    startTime TIMESTAMP NOT NULL,
                    room_id INT CONSTRAINT PRES_ROOM_FK REFERENCES room(room_id),
                    movie_id INT CONSTRAINT PRES_MOVIE_FK REFERENCES movie(movie_id)

);


CREATE TABLE c_row (
                    row_id INT,
                    room_id INT CONSTRAINT ROW_ROOM_FK REFERENCES room(room_id),
                    additional_charge DOUBLE PRECISION,
                    CONSTRAINT ROW_PK PRIMARY KEY (row_id,room_id)
);


create table seat
(
    seat_id INT NOT NULL,
    row_id INT NOT NULL,
    room_id INT NOT NULL,
    CONSTRAINT SEAT_ROW_FK foreign key (row_id,room_id) references c_row,
    constraint SEAT_PK
        primary key (seat_id, row_id, room_id)
);

CREATE TABLE ticket (
                    ticket_id INT
                        CONSTRAINT TICKET_PK
                        PRIMARY KEY
                        GENERATED ALWAYS AS IDENTITY,
                    seat_id int not null,
                    row_id int not null,
                    room_id int not null,
                    presentation_id INT CONSTRAINT TICK_PRES_FK REFERENCES presentation(presentation_id),
                    CONSTRAINT TICK_SEAT_FK foreign key(seat_id,row_id,room_id) REFERENCES seat(seat_id, row_id, room_id)
);
