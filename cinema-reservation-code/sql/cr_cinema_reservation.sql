
CREATE TABLE movie (
                    movie_id INT NOT NULL PRIMARY KEY,
                    title VARCHAR(200) NOT NULL,
                    price INT NOT NULL
);

CREATE TABLE room (
                    room_id INT NOT NULL PRIMARY KEY
);

CREATE TABLE c_row (
                    row_id INT NOT NULL PRIMARY KEY,
                    room_id INT REFERENCES room(room_id),
                    additional_charge DOUBLE PRECISION
);


CREATE TABLE seat (
                    seat_id INT NOT NULL PRIMARY KEY,
                    row_id INT REFERENCES c_row(row_id)
);

CREATE TABLE ticket (
                    ticket_id INT NOT NULL PRIMARY KEY,
                    seat_id INT REFERENCES seat(seat_id),
                    presentation_id INT REFERENCES presentation(presentation_id)
);

CREATE TABLE presentation (
                    presentation_id INT NOT NULL PRIMARY KEY,
                    startTime TIMESTAMP not null
);


CREATE TABLE price (
                    presentation_id INT REFERENCES presentation(presentation_id),
                    row_id INT REFERENCES c_row(row_id),
                    special_price DOUBLE PRECISION
);
