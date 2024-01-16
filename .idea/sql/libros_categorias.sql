create table libros_categorias(
    isbn varchar(20) unique,
    categoria_id integer,
    foreign key(isbn) references libros(isbn),
    foreign key(categoria_id) references categorias(categoria_id)
);

select * from libros_categorias;