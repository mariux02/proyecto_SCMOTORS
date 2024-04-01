-- Se crea la base de datos para SC MOTORS
drop schema if exists sc_motors;
CREATE SCHEMA sc_motors;

-- Se crea un usuario para la base de datos
create user if not exists 'usuario_prueba'@'%' identified by 'Usuar1o_Clave.';

-- Se asignan los privilegios sobre la base de datos a SC MOTORS al usuario creado
GRANT ALL PRIVILEGES ON sc_motors.* TO 'usuario_prueba'@'%';
FLUSH PRIVILEGES;

CREATE TABLE `sc_motors`.`vehiculo` (
  `id_vehiculo` INT NOT NULL auto_increment,
  `marca` VARCHAR(20) NOT NULL,
  `modelo` VARCHAR(20) NOT NULL,
  `year` INT NOT NULL,
  `precio` DOUBLE,
  `estado` VARCHAR(15) DEFAULT 'Semi Usado',
  PRIMARY KEY (`id_vehiculo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO `sc_motors`.`vehiculo` (`marca`, `modelo`, `year`, `precio`, `estado`) VALUES
('Toyota', 'Hiace', 2020, 40800, 'Semi Usado'),
('Toyota', 'Hilux', 2019, 34990, 'Semi Usado'),
('Suzuki', 'New Vitara', 2020, 22490, 'Semi Usado'),
('Toyota', 'Prado', 2022, 52990, 'Semi Usado'),
('Nissan', 'Urvan', 2019, 29008, 'Semi Usado'),
('Toyota', 'Rav4', 2017, 34990, 'Semi Usado'),
('Hyundai', 'Tucson', 2020, 17890, 'Semi Usado'),
('Toyota', 'Rush', 2016, 28490, 'Semi Usado'),
('Isuzu', 'Dmax', 2020, 26164, 'Semi Usado'),
('Isuzu', 'NRL', 2017, 25027, 'Semi Usado'),
('Isuzu', 'NQR', 2018, 37351, 'Semi Usado');

CREATE TABLE `sc_motors`.usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(512) NOT NULL,
  nombre VARCHAR(20) NOT NULL,
  apellidos VARCHAR(30) NOT NULL,
  correo VARCHAR(25) NULL,
  telefono VARCHAR(15) NULL,
  ruta_imagen varchar(1024),
  activo boolean,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

 INSERT INTO `sc_motors`.usuario (id_usuario, username,password,nombre, apellidos, correo, telefono,ruta_imagen,activo) VALUES 
(1,'juan','$2a$10$P1.w58XvnaYQUQgZUCk4aO/RTRl8EValluCqB3S2VMLTbRt.tlre.','Juan', 'Castro Mora',    'jcastro@gmail.com',    '4556-8978', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Juan_Diego_Madrigal.jpg/250px-Juan_Diego_Madrigal.jpg',true),
(2,'rebeca','$2a$10$GkEj.ZzmQa/aEfDmtLIh3udIH5fMphx/35d0EYeqZL5uzgCJ0lQRi','Rebeca',  'Contreras Mora', 'acontreras@gmail.com', '5456-8789','https://upload.wikimedia.org/wikipedia/commons/0/06/Photo_of_Rebeca_Arthur.jpg',true),
(3,'pedro','$2a$10$koGR7eS22Pv5KdaVJKDcge04ZB53iMiw76.UjHPY.XyVYlYqXnPbO','Pedro', 'Mena Loria',     'lmena@gmail.com',      '7898-8936','https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Eduardo_de_Pedro_2019.jpg/480px-Eduardo_de_Pedro_2019.jpg?20200109230854',true);

CREATE TABLE `sc_motors`.rol (
  id_rol INT NOT NULL AUTO_INCREMENT,
  nombre varchar(20),
  id_usuario int,
  PRIMARY KEY (id_rol),
  foreign key fk_rol_usuario (id_usuario) references usuario(id_usuario)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

 INSERT INTO `sc_motors`.rol (id_rol, nombre, id_usuario) values
 (1,'ROLE_ADMIN',1), (2,'ROLE_VENDEDOR',1), (3,'ROLE_USER',1),
 (4,'ROLE_VENDEDOR',2), (5,'ROLE_USER',2),
 (6,'ROLE_USER',3);

select * from sc_motors.usuario;