# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  id                            bigint auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  phone                         varchar(255),
  email                         varchar(255),
  constraint pk_customer primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists customer;

drop table if exists product;

