create table prestamos(
    prestamo_id integer primary key,
    fecha_prestamo date not null,
    fecha_prestamo_devolucion date not null,

    isbn varchar(20) unique,
    lector_id integer,

    foreign key(isbn) references libros(isbn),
    foreign key (lector_id) references lectores(lector_id)

);

select * from prestamos;

