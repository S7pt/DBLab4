DROP SCHEMA IF EXISTS `osadchuk`;

CREATE SCHEMA `osadchuk`;
USE `osadchuk`;

CREATE TABLE `driver`(
`id` INT AUTO_INCREMENT NOT NULL,
`name` VARCHAR(35) NOT NULL,
`surname` VARCHAR(35) NOT NULL,
PRIMARY KEY(`id`)
);

CREATE TABLE `producer`(
`id` INT AUTO_INCREMENT NOT NULL,
`producer_name` VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY(`id`)
);

CREATE TABLE `route`(
`id` INT AUTO_INCREMENT NOT NULL,
`starting_address` VARCHAR(45) NOT NULL,
`destination` VARCHAR(45) NOT NULL,
`route_number` VARCHAR(7) NOT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `stop`(
`id` INT AUTO_INCREMENT NOT NULL,
`address` VARCHAR(45) NOT NULL,
PRIMARY KEY(`id`)
);

CREATE TABLE `bus_model`(
`id` INT AUTO_INCREMENT NOT NULL,
`producer_id` INT NOT NULL,
`color` VARCHAR(12) NOT NULL,
`capacity` INT NOT NULL,
`model_name` VARCHAR(30) NOT NULL,
INDEX `capacity_index`(`capacity`),
PRIMARY KEY(`id`),
CONSTRAINT `fk_producer_id` FOREIGN KEY(`producer_id`)
REFERENCES `producer`(`id`)
);

CREATE TABLE `bus`(
`id` INT AUTO_INCREMENT NOT NULL,
`driver_id` INT NOT NULL,
`route_id` INT NOT NULL,
`bus_model_id` INT NOT NULL,
`age` INT NOT NULL,
`mileage` INT NOT NULL,
INDEX `index_route_id`(`route_id`),
PRIMARY KEY(`id`),
CONSTRAINT `fk_driver_id` FOREIGN KEY(`driver_id`)
REFERENCES `driver`(`id`),
CONSTRAINT `fk_bus_route_id` FOREIGN KEY(`route_id`)
REFERENCES `route`(`id`),
CONSTRAINT `fk_bus_model_id` FOREIGN KEY(`bus_model_id`)
REFERENCES `bus_model`(`id`)
);

CREATE TABLE `distance_between_stops`(
`id` INT AUTO_INCREMENT NOT NULL,
`start_id` INT NOT NULL,
`finish_id` INT NOT NULL,
`distance` INT NOT NULL,
PRIMARY KEY (`id`),
CONSTRAINT `fk_start_id` FOREIGN KEY(`start_id`)
REFERENCES `stop`(`id`),
CONSTRAINT `fk_finish_id` FOREIGN KEY(`finish_id`)
REFERENCES `stop`(`id`)
);

INSERT INTO `driver`(`name`,`surname`)
	VALUES("Ivan","Tarasenko"),
	("Taras","Ivanenko"),
    ("Stepan","Bandera"),
    ("Adolf","Stalin"),
    ("Joseph","Hitler"),
    ("Maryan","Kit"),
    ("Dmytro","Shevchenko"),
    ("Verhniy","Tekst"),
    ("Nizhniy","Tekst"),
    ("Sample","Tekst");

INSERT INTO `producer`(`producer_name`)
	VALUES("Bogdan"),
    ("Ivan"),
    ("Varolant"),
    ("Jeki"),
    ("Umb"),
    ("TarGan");

INSERT INTO `route`(`starting_address`,`destination`,`route_number`)
	VALUES("Banderu 5","Platona 7","75A"),
    ("Platona 7","Doroshenka 3","20"),
    ("Ivana 3","Ivanenka 6","29"),
    ("Bodnara 2","Banderu 5","17"),
    ("Doroshenka 3","Ivana 6","31A"),
    ("Dota 5","Gorodotska 7","25"),
    ("Gorodotska 7", "Dota 2","51"),
    ("Bodnara 23","Doroshenka 10","217A"),
    ("Ivana 5","Platona 3","35"),
    ("Doroshenka 10","Bogdana 7", "250");

INSERT INTO `stop`(`address`)
	VALUES("Banderu 5"),
    ("Platona 7"),
    ("Ivana 3"),
    ("Bodnara 2"),
    ("Doroshenka 3"),
    ("Dota 5"),
    ("Banderu 5"),
    ("Gorodotska 7"),
    ("Bodnara 23"),
    ("Doroshenka 10");

INSERT INTO `bus_model`(`producer_id`,`color`,`capacity`,`model_name`)
	VALUES(3,"Red",50,"D500"),
    (1,"Blue",30,"U740"),
    (2,"Green",35,"Z500"),
    (4,"Orange",40,"U500"),
    (5,"Red",50,"C500"),
    (3,"Yellow",50,"A500"),
    (2,"Blue",30,"U500"),
    (5,"Purple",45,"M500"),
    (4,"Orange",50,"P500"),
    (3,"Fuscia",30,"L500");

INSERT INTO `bus`(`driver_id`,`route_id`,`bus_model_id`,`age`,`mileage`)
	VALUES(2,5,1,20,15000),
    (3,5,1,20,15000),
    (4,1,2,15,1500),
    (5,1,3,10,1000),
    (5,4,4,3,1200),
    (3,6,5,7,1300),
    (7,3,6,10,17000),
    (8,8,7,15,2000),
    (1,3,8,6,3000),
    (2,2,9,16,5000),
    (3,7,3,2,12000);
  
INSERT INTO `distance_between_stops`(`start_id`,`finish_id`,`distance`)
	VALUES(1,3,5000),
    (2,5,2500),
    (1,7,10000),
    (3,7,6000),
    (9,3,15000),
    (5,3,2000),
    (6,4,3000),
    (8,1,7000),
    (9,4,100),
    (5,6,200);
