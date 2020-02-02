/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     1/2/2020 19:33:52                            */
/*==============================================================*/


drop table if exists EQUIPOFUTBOL;

drop table if exists JUGADOR;

drop table if exists PERFIL;

/*==============================================================*/
/* Table: EQUIPOFUTBOL                                          */
/*==============================================================*/
create table EQUIPOFUTBOL
(
   IDEQUIPO             int not null,
   NOMBREEQUIPO         varchar(40) not null,
   LIGA                 varchar(40) not null,
   FECHACREACION        date not null,
   NUMEROINTER          int not null,
   CAMPEONACTUAL        bool not null,
   primary key (IDEQUIPO)
);

/*==============================================================*/
/* Table: JUGADOR                                               */
/*==============================================================*/
create table JUGADOR
(
   IDJUGADOR            int not null,
   IDEQUIPO             int,
   NOMBREJUGADOR        varchar(60) not null,
   NUMEROCAMISETA       int not null,
   NOMBRECAMISETA       varchar(20) not null,
   FECHAINGRESO         date not null,
   GOLES                int not null,
   primary key (IDJUGADOR)
);

alter table JUGADOR comment '
';

/*==============================================================*/
/* Table: PERFIL                                                */
/*==============================================================*/
create table PERFIL
(
   USUARIO              varchar(20) not null,
   CLAVE                varchar(100) not null,
   PERMISO              char(1) not null,
   NOMBRE               varchar(100) not null,
   primary key (USUARIO)
);

alter table JUGADOR add constraint FK_CONTIENE foreign key (IDEQUIPO)
      references EQUIPOFUTBOL (IDEQUIPO) on delete restrict on update restrict;

