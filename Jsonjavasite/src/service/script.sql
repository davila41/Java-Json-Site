drop database if exists pessoas;
create database pessoas;
use pessoas;

create table Pessoas(
nome varchar (50),
sexo varchar (50),
email varchar (50),
idade int,
id int primary key auto_increment);

insert into pessoas values ('Bia','Feminino','bia@gmail.com',19,null);
insert into pessoas values ('Augusto','Masculino','augusto@gmail.com',25,null);
insert into pessoas values ('Cris','Feminino','cris@gmail.com',37,null);

select * from pessoas;