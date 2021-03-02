create table postal_code (
                             id serial not null primary key,
                             value integer not null
);


create table county (
                        id serial not null primary key,
                        county_name text,
                        x numeric not null,
                        y numeric not null
);

create table city (
                      id serial not null primary key,
                      city_name text,
                      county_id integer not null,
                      foreign key (county_id) references county (id)
);

create table street (
                        id serial not null primary key,
                        street_name text,
                        postal_code_id integer not null,
                        foreign key (postal_code_id) references postal_code (id)
);

create table address (
                         id          serial   not null PRIMARY KEY,
                         house_number integer not null,
                         city_id integer not null,
                         foreign key (city_id) references city (id),
                         street_id integer not null,
                         foreign key (street_id) references street(id)

);

create table recycle_bin (
                             id serial not null primary key,
                             recyle_bin_name text
);

create table address_recycle_bin (
                                     id serial not null primary key,
                                     address_id integer not null,
                                     recycle_bin_id integer not null,
                                     foreign key (address_id) references address (id),
                                     foreign key (recycle_bin_id) references recycle_bin (id)
);

INSERT INTO public.address (house_number,city_id,street_id) VALUES
(12,1,1),
(1,2,2),
(13,1,1);

INSERT INTO public.address_recycle_bin (address_id,recycle_bin_id) VALUES
(1,1),
(2,2),
(1,3);

INSERT INTO public.city (city_name,county_id) VALUES
('Pecs',1),
('Kaposvar',2);

INSERT INTO public.county (county_name,x,y) VALUES
('Baranya',2,3),
('Kapos',3,4),
('Somogy',66,69);

INSERT INTO public.postal_code (value) VALUES
(1234),
(4567),
(1212);

INSERT INTO public.recycle_bin (recycle_bin_name) VALUES
('A'),
('B'),
('C');

INSERT INTO public.street (street_name,postal_code_id) VALUES
('Csillag koz',1),
('Petofi utca',2),
('Nagy ter',3);

