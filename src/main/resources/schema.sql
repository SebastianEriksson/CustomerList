CREATE TABLE IF NOT EXISTS customer (
    customer_id int(5) NOT NULL AUTO_INCREMENT,
    firstName varchar(50) DEFAULT NULL,
    lastName varchar(50) DEFAULT NULL,
    email varchar(50) DEFAULT NULL,
    address varchar(50) DEFAULT NULL,
    postcode varchar(50) DEFAULT NULL,
    phone varchar(50) DEFAULT NULL,
    PRIMARY KEY(customer_id)
    );