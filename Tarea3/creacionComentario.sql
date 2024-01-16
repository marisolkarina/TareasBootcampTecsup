create table if not exists comentario(
    comentario_id serial primary key,
    num_reacciones integer not null,
    contenido text not null,

    post_id_fk integer,
    usuario_id_fk integer
);

alter table comentario
add constraint fk_post
foreign key(post_id_fk)
references post(post_id)
on delete cascade;

alter table usuario
add constraint fk_usuario
foreign key(usuario_id_fk)
references usuario(usuario_id)
on delete set null;

select * from comentario

