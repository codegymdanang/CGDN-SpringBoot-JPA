# CGDN-SpringBoot-JPA

### Chúng ta sẽ xây dựng ứng dụng quản lý phòng ban tại 1 công ty kinh doanh. Một phòng ban gồm nhiều nhân viên. Ví dụ như phòng kế toán có nhân viên A,B,C ; phòng nhân sự có nhân viên XYZ.
+ Chuẩn bị database tên company . Trong database company tạo 2 table là department (phòng ban) và employee (nhân viên).
 
CREATE TABLE `company`.`department` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) );
  
  CREATE TABLE `company`.`employee` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NULL,
    `age` INT NULL,
    `email` VARCHAR(45) NULL,
    `departmentId` INT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) );
    
    ALTER TABLE `company`.`employee` 
    ADD INDEX `department_employeen_idx` (`departmentId` ASC) ;
    ;
    ALTER TABLE `company`.`employee` 
    ADD CONSTRAINT `department_employeen`
      FOREIGN KEY (`departmentId`)
      REFERENCES `company`.`department` (`id`)
      ON DELETE CASCADE
      ON UPDATE CASCADE;
      
      INSERT INTO `company`.`department` (`id`, `name`, `description`) VALUES ('1', 'Software', 'Software department');

INSERT INTO `company`.`employee` (`id`, `name`, `age`, `email`, `departmentId`) VALUES ('1', 'Le Vu Nguen', '36', 'nguyen.le@codegym.vn', '1');

+ Quan hệ một nhiều được 


+ Query Creation
+ Using JPA Named Queries
+ Using @Query
+ Using Sort
+ Using Named Parameters
+ Using SpEL Expressions
+ Modifying Queries
+ Applying Query Hints
+ Configuring Fetch- and LoadGraphs
+ Projections
