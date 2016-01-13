CREATE TABLE `phonebook`.`phonebook` (
  `id` INT NOT NULL,
  `firstname` VARCHAR(128) NULL,
  `lastname` VARCHAR(128) NULL,
  `phone_number` VARCHAR(32) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `phone_number_UNIQUE` (`phone_number` ASC));