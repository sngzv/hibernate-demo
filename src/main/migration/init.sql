create table teacher
(
    id            bigserial not null,
    name          varchar(255),
    patronymic    varchar(255),
    surname       varchar(255),
    university_id int8,
    primary key (id)
);


create table university
(
    id   bigserial not null,
    name varchar(255),
    primary key (id)
);

alter table if exists Teacher
    add constraint university_id_fk
        foreign key (university_id)
            references university;