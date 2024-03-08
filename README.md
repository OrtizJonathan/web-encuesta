Codigo back-end de proyecto encuesta musical

Se utilizó base de datos MySql, ejecutar en MySql Workbench los siguientes comandos para la creacion de la bd y su uso:

create database bd_encuesta; 
use bd_encuesta;

En caso de querer cambiar el nombre de la bd o sus credenciales favor modificar archivo "application.properties" para que la conexion sea exitosa. Las tablas y relaciones se crearán automáticamente una vez el programa sea ejecutado. Favor llenar tabla estilo_musica de la base de datos una vez la primera ejecucion del back haya sido exitosa.

insert into estilo_musica values (1, "Merengue"); 
insert into estilo_musica values (2, "Pop"); 
insert into estilo_musica values (3, "Rock"); 
insert into estilo_musica values (4, "Salsa");

Favor revisar archivo "pom.xml" para versiones y dependencias ocupadas. Java 21 SpringBoot 3.2.3
