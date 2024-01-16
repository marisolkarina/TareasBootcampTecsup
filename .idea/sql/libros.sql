create table libros(
    isbn varchar(20) primary key unique,
    titulo varchar(30) not null
);

select * from libros;

delete from libros;