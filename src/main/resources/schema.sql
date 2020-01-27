DROP TABLE IF EXISTS `bookstore_db`.`genres`;

CREATE TABLE `bookstore_db`.`genres` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

DROP TABLE IF EXISTS `bookstore_db`.`books`;  

CREATE TABLE `bookstore_db`.`books` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `front_cover` VARCHAR(45) NOT NULL,
  `genre_id` INT NOT NULL,
  `price` DECIMAL(4,2) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_idx` (`genre_id` ASC) VISIBLE,
  CONSTRAINT `fk`
    FOREIGN KEY (`genre_id`)
    REFERENCES `bookstore_db`.`genre` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);