DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS user(id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO user(name) VALUES ('John'), ('Mike'), ('Jim'), ('James'),('Robert'),('Philip');


DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, cost int, title VARCHAR(255), PRIMARY KEY (id), product_id bigint REFERENCES user(id));
INSERT INTO proucts (cost, title, product_id) VALUES (100, 'Milk', 1), (80,'Bread', 2), (120,'Juice', 3), (20,'Ice Cream', 4),(170,'Meat',5);
