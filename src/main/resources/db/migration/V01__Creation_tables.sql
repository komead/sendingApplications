CREATE TABLE boxes (
    id int NOT NULL AUTO_INCREMENT,
    barcode varchar(45) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE products (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(60) NOT NULL,
    gtin varchar(14) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE applications (
    id int NOT NULL AUTO_INCREMENT,
    number varchar(5) NOT NULL,
    description varchar(160) DEFAULT NULL,
    completed tinyint(1) NOT NULL DEFAULT 0,
    PRIMARY KEY (id)
);

CREATE TABLE product_info (
    id int NOT NULL AUTO_INCREMENT,
    product_id int NOT NULL,
    package_number varchar(4) NOT NULL,
    box_id int DEFAULT NULL,
    used tinyint(1) NOT NULL DEFAULT 0,
    PRIMARY KEY (id),
    UNIQUE KEY id_UNIQUE (id),
    FOREIGN KEY (box_id) REFERENCES boxes (id),
    FOREIGN KEY (product_id) REFERENCES products (id)
);

CREATE TABLE application_details (
    id int NOT NULL AUTO_INCREMENT,
    application_id int NOT NULL,
    products_id int NOT NULL,
    quantity int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (application_id) REFERENCES applications (id),
    FOREIGN KEY (products_id) REFERENCES products (id)
);