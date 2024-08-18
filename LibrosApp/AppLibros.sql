use master
go

create database SisAppLibros
go

create table Autores(
authorid int primary key identity,
firstName varchar (200) not null,
lastName varchar (200) not null
);