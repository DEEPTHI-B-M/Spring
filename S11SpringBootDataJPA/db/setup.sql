use mydb;

drop table product;

create table product (
 id int AUTO_INCREMENT PRIMARY KEY,
 name varchar(50),
    description varchar(50),
    price varchar(50)
);