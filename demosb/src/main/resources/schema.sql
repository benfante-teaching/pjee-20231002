
    create sequence Film_SEQ start with 1 increment by 50;

    create sequence Language_SEQ start with 1 increment by 50;

    create table Film (
        id bigint not null,
        language_id bigint,
        title varchar(255),
        primary key (id)
    );

    create table Language (
        id bigint not null,
        name varchar(255),
        primary key (id)
    );

    alter table if exists Film 
       add constraint FKnd2ldbqoo5hvipegj9vni170b 
       foreign key (language_id) 
       references Language;
