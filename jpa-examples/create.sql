
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
INSERT INTO Language (id, name) VALUES (1, 'English');
INSERT INTO Language (id, name) VALUES (2, 'Italian');
INSERT INTO Film (id, language_id, title) VALUES (1, 1, 'The Matrix');
INSERT INTO Film (id, language_id, title) VALUES (2, 2, 'Fantozzi');

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
INSERT INTO Language (id, name) VALUES (1, 'English');
INSERT INTO Language (id, name) VALUES (2, 'Italian');
INSERT INTO Film (id, language_id, title) VALUES (1, 1, 'The Matrix');
INSERT INTO Film (id, language_id, title) VALUES (2, 2, 'Fantozzi');

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
INSERT INTO Language (id, name) VALUES (1, 'English');
INSERT INTO Language (id, name) VALUES (2, 'Italian');
INSERT INTO Film (id, language_id, title) VALUES (1, 1, 'The Matrix');
INSERT INTO Film (id, language_id, title) VALUES (2, 2, 'Fantozzi');

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
INSERT INTO Language (id, name) VALUES (1, 'English');
INSERT INTO Language (id, name) VALUES (2, 'Italian');
INSERT INTO Film (id, language_id, title) VALUES (1, 1, 'The Matrix');
INSERT INTO Film (id, language_id, title) VALUES (2, 2, 'Fantozzi');
