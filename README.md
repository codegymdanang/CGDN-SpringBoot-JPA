# CGDN-SpringBoot-JPA

CREATE TABLE `company`.`department` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
  CREATE TABLE `company`.`employee` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `age` INT NULL,
    `email` VARCHAR(45) NULL,
    `departmentId` INT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
    
    ALTER TABLE `company`.`employee` 
    ADD INDEX `department_employeen_idx` (`departmentId` ASC) VISIBLE;
    ;
    ALTER TABLE `company`.`employee` 
    ADD CONSTRAINT `department_employeen`
      FOREIGN KEY (`departmentId`)
      REFERENCES `company`.`department` (`id`)
      ON DELETE CASCADE
      ON UPDATE CASCADE;
      
      INSERT INTO `company`.`department` (`id`, `name`, `description`) VALUES ('1', 'Software', 'Software department');

INSERT INTO `company`.`employee` (`id`, `name`, `age`, `email`, `departmentId`) VALUES ('1', 'Le Vu Nguen', '36', 'nguyen.le@codegym.vn', '1');


5.3.2. Query Creation
5.3.3. Using JPA Named Queries
5.3.4. Using @Query
5.3.5. Using Sort
5.3.6. Using Named Parameters
5.3.7. Using SpEL Expressions
5.3.8. Modifying Queries
5.3.9. Applying Query Hints
5.3.10. Configuring Fetch- and LoadGraphs
5.3.11. Projections
