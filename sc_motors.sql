-- Se crea la base de datos para SC MOTORS
drop schema if exists sc_motors;
CREATE SCHEMA sc_motors;

-- Se crea un usuario para la base de datos
create user if not exists 'usuario_prueba'@'%' identified by 'Usuar1o_Clave.';

-- Se asignan los privilegios sobre la base de datos a SC MOTORS al usuario creado
GRANT ALL PRIVILEGES ON sc_motors.* TO 'usuario_prueba'@'%';
FLUSH PRIVILEGES;

CREATE TABLE `sc_motors`.`vehiculo` (
  `id_vehiculo` VARCHAR(6) NOT NULL,
  `marca` VARCHAR(20) NOT NULL,
  `modelo` VARCHAR(20) NOT NULL,
  `año` INT NOT NULL,
  `precio` DECIMAL(10,2),
  `estado` VARCHAR(15) DEFAULT 'Semi Usado',
  PRIMARY KEY (`id_vehiculo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO `sc_motors`.`vehiculo` (`id_vehiculo`, `marca`, `modelo`, `año`, `precio`, `estado`) VALUES
('123ABC', 'Toyota', 'Hiace', 2020, 40800.00, 'Semi Usado'),
('234DEF', 'Toyota', 'Hilux', 2019, 34990.00, 'Semi Usado'),
('345GHI', 'Suzuki', 'New Vitara', 2020, 22490.00, 'Semi Usado'),
('456JKL', 'Toyota', 'Prado', 2022, 52990.00, 'Semi Usado'),
('567MNO', 'Nissan', 'Urvan', 2019, 29008.00, 'Semi Usado'),
('678PQR', 'Toyota', 'Rav4', 2017, 34990.00, 'Semi Usado'),
('789STU', 'Hyundai', 'Tucson', 2020, 17890.00, 'Semi Usado'),
('890VWX', 'Toyota', 'Rush', 2016, 28490.00, 'Semi Usado'),
('901YZA', 'Isuzu', 'Dmax', 2020, 26164.00, 'Semi Usado'),
('012BCD', 'Isuzu', 'NRL', 2017, 25027.00, 'Semi Usado'),
('123EFG', 'Isuzu', 'NQR', 2018, 37351.00, 'Semi Usado');

CREATE TABLE `sc_motors`.`usuarios` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(20) NOT NULL,
  `password` VARCHAR(512) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `apellidos` VARCHAR(30) NOT NULL,
  `correo` VARCHAR(25) NULL,
  `telefono` VARCHAR(15) NULL,
  `ruta_imagen` VARCHAR(1024),
  `activo` BOOLEAN,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

-- Actualización de los datos de los usuarios existentes y adición de un nuevo usuario
INSERT INTO `sc_motors`.`usuarios` (`username`, `password`, `nombre`, `apellidos`, `correo`, `telefono`, `ruta_imagen`, `activo`) VALUES
('luis456', '123456', 'Luis', 'Pérez Juárez', 'lperez@gmail.com', '5556-1234', 'https://ruta/a/imagen/luis.jpg', true),
('marta789', '234567', 'Marta', 'Benitez Rojas', 'mbenitez@gmail.com', '6666-5678', 'https://ruta/a/imagen/marta.jpg', true),
('carlos123', '345678', 'Carlos', 'Luna Morales', 'cluna@gmail.com', '7777-8910', 'https://ruta/a/imagen/carlos.jpg', true),
('ana234', '456789', 'Ana', 'Torres Lima', 'atorres@gmail.com', '8888-1212', 'https://ruta/a/imagen/ana.jpg', true);

CREATE TABLE `sc_motors`.`rol` (
  `id_rol` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20),
  `id_usuario` int,
  PRIMARY KEY (`id_rol`),
  foreign key fk_rol_usuarios (`id_usuario`) references `usuarios`(`id_usuario`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

 INSERT INTO `sc_motors`.`rol` (`id_rol`, nombre, `id_usuario`) values
 (1,'ROLE_ADMIN',1), (2,'ROLE_VENDEDOR',1), (3,'ROLE_USER',1),
 (4,'ROLE_VENDEDOR',2), (5,'ROLE_USER',2),
 (6,'ROLE_USER',3);
 
 select * from `sc_motors`.`usuarios`;
