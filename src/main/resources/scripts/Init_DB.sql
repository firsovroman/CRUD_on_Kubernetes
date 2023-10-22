CREATE SEQUENCE user_id_seq
    START 1
    INCREMENT 1
    MAXVALUE 9223372036854775807
    MINVALUE 1
    CACHE 1;



CREATE TABLE IF NOT EXISTS user (
    id BIGINT DEFAULT nextval('user_id_seq') PRIMARY KEY,
    first_name varchar(50) not null,
    last_name VARCHAR(100) not null
    );

INSERT INTO user (id, first_name, last_name) VALUES (DEFAULT, 'Stepan', 'Stepanov');
