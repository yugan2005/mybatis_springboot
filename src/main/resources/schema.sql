create table if not exists user
(
    id         int         not null auto_increment,
    first_name varchar(20) not null,
    last_name  varchar(20) not null,
    birthday  datetime    null,
    primary key (id)
);
create index if not exists index_first_last_name on user (first_name, last_name);
create index if not exists index_birthday on user (birthday);