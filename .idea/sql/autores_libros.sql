create table autores_libros(
    isbn varchar(25) unique,
    autor_id integer,
    foreign key(isbn) references libros(isbn),
    foreign key(autor_id) references autores(autor_id)
);

select * from autores_libros;
