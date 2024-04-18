create database hotel;
use  hotel;
create table room ( idroom int primary key ,
 roomtype varchar(40)  , price double,  equipement varchar(40),
 dispo boolean);
 
 create table Reservation ( idreservation int primary key ,
 idroom int, datereseve date ,
  FOREIGN KEY (idroom) REFERENCES room(idroom)

 );
                   
