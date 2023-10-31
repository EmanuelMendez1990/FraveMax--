-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 31-10-2023 a las 18:19:43
-- Versión del servidor: 8.1.0
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `newschema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `dni` int NOT NULL,
  `nombre` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `domicilio` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `tel` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

DROP TABLE IF EXISTS `detalle`;
CREATE TABLE IF NOT EXISTS `detalle` (
  `idDetalle` int NOT NULL AUTO_INCREMENT,
  `idVenta` int NOT NULL,
  `idProducto` int NOT NULL,
  `cantidad` int NOT NULL,
  `total` double NOT NULL,
  `entregado` tinyint(1) NOT NULL,
  `detalle` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`idDetalle`),
  KEY `idVenta` (`idVenta`),
  KEY `idProducto` (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`idDetalle`, `idVenta`, `idProducto`, `cantidad`, `total`, `entregado`, `detalle`) VALUES
(3, 1, 2, 1, 20000, 1, ''),
(4, 1, 2, 1, 20000, 1, ''),
(5, 1, 2, 1, 20000, 1, ''),
(6, 1, 2, 1, 20000, 1, ''),
(7, 5, 2, 1, 20000, 1, 'Venta'),
(8, 5, 3, 2, 40000, 1, 'Venta'),
(9, 6, 4, 2, 400000, 1, 'Venta'),
(10, 7, 2, 1, 20000, 1, 'Venta'),
(11, 7, 3, 1, 20000, 1, 'Venta'),
(12, 7, 4, 1, 200000, 1, 'Venta'),
(13, 8, 5, 1, 1000000, 1, 'Venta'),
(14, 9, 5, 1, 1000000, 1, 'Venta'),
(15, 10, 5, 1, 1000000, 1, 'Venta'),
(16, 11, 4, 6, 1200000, 1, 'Venta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `stock` int NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `descripcion` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `categoria` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `precio` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `enOferta` int NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `stock`, `nombre`, `descripcion`, `categoria`, `precio`, `estado`, `enOferta`) VALUES
(2, 10, 'Licuadora', 'Licuadora TOP HOUSE', 'LINEABLANCA', 20000, 1, 30),
(3, 15, 'Tostadora', 'Tostadora 4 panes Liliana', 'PAE', 20000, 1, 0),
(4, 1, 'Televisor 55', 'Televisor Philips', 'TELEVISORES', 200000, 1, 0),
(5, 0, 'PC', 'PC Gamer', 'COMPUTACION', 1000000, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `rol` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `dni` int NOT NULL,
  `nombre` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `apellido` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `fechaIngreso` date NOT NULL,
  `usuario` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `pass` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `salt` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tel` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `domicilio` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `dni` (`dni`),
  UNIQUE KEY `usuario` (`usuario`),
  UNIQUE KEY `emaill` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `rol`, `dni`, `nombre`, `apellido`, `fechaIngreso`, `usuario`, `pass`, `salt`, `tel`, `domicilio`, `email`) VALUES
(1, 'CLIENTE', 87654321, 'Julia', 'Roberts', '1976-08-13', 'julia321', 'BlO9SpxXu1yNM0ebyea/hrn4+jjiZx9weMlg3CIOTvo=', 'aOy86PiezQNRxgTIMJkWZQCft5eqze', '345234523', 'AvSiempreViva1233', 'julia_r@gmail.com'),
(2, 'ADMINISTRADOR', 33654321, 'Sebastian', 'Rodriguez', '1988-07-23', 'Sebas', 'Nz/JT4VGxQaV/RKggxulfR7NNSyy+VkJDgxn0Lyzq1E=', 'AuSyZfVi3YmD3BSWHvuhIqWlU9EXO6', '456643443', 'AvSiempreViva1234', 'sebasr@gmail.com'),
(3, 'CLIENTE', 345345, 'Rodrigo', 'Perez', '0000-00-00', '345345', 'LSuOMe8ILmOQJKXAWd7s0LwrFVf96J0kh1zqsFyx4mw=', '', '15654567', 'Lima 34', 'Rodrigo@gmail.com'),
(4, 'VENDEDOR', 34567643, 'Jazmin', 'Duarte', '0000-00-00', 'jazmin', 'tTMJIJJIP+bMinVj2MtWB7pJHNV5mYPnWuvraywDn8U=', '019IgZ7Sq4dgqQUIobCETNw1pdXmxx', '456555676', 'Maipu 455', 'Jazmin@gmail.com'),
(5, 'CLIENTE', 34223344, 'Carlos', 'Gonzales', '0000-00-00', '34223344', 'dTnMiz5qyiEpTCXHWke2fs1o6NjoKmzQE2/dT2xVkQE=', '3koYpkuWSrO9pR7haD5h1xF3UiK3Nd', '45676445', 'San Luis 222', 'Carlos@gmai.com'),
(6, 'VENDEDOR', 34567765, 'Cristian', 'Roman', '0000-00-00', 'cristian', 'ZYmhpDuT74tvHkhW45qf7BSEen7BYoup3agTmi8jAnk=', 'nZo584dHtgUsceBplcr4dhzVjkcY4o', '15456557', 'Paraguay 444', 'Cristian@gmail.com'),
(7, 'VENDEDOR', 123123123, 'sdf', 'sdfsd', '0000-00-00', 'asdasd', 'LCWFhu1T+TNXyyplpQBek3PaWru2CivzBwn/vZpomwY=', 'uYzVlcTFkxz9TmVM7Uqkamuirgqn83', '21312', 'asdasd', 'saddas'),
(11, 'ADMINISTRADOR', 234, 'sdfsd', 'sdf', '0000-00-00', 'asd', 'ziY4Dgjlo4hXVzBpML1YTKxU75wVdYIQ3zuhyOpXA2Y=', '7qzrHZHx0ubaW1RSjRwNpEFJGljfkG', '4234', 'sdfsd', 'sfsdfds'),
(12, 'VENDEDOR', 111, 'asdasd', 'asdas', '2023-10-20', 'asddasd', 'BSzPZ+kV0CdP7DftVrBRO27Ph+heY382HKnMZUIM3x0=', 'Tcl2YezWoEZS3rCTqgOfUdss7AHFpB', '3123', 'asd', 'asd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

DROP TABLE IF EXISTS `venta`;
CREATE TABLE IF NOT EXISTS `venta` (
  `idVenta` int NOT NULL AUTO_INCREMENT,
  `idUsuario` int NOT NULL,
  `fecha` date NOT NULL,
  `total` double NOT NULL,
  `idCliente` int NOT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `idUsuario` (`idUsuario`),
  KEY `idCliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `idUsuario`, `fecha`, `total`, `idCliente`) VALUES
(1, 1, '0000-00-00', 20000, 1),
(2, 1, '0000-00-00', 20000, 1),
(3, 1, '0000-00-00', 20000, 1),
(4, 1, '0000-00-00', 20000, 1),
(5, 2, '2023-10-20', 60000, 12),
(6, 2, '2023-10-24', 400000, 1),
(7, 2, '2023-10-24', 240000, 3),
(8, 2, '2023-10-24', 1000000, 3),
(9, 2, '2023-10-26', 1000000, 1),
(10, 2, '2023-10-26', 1000000, 3),
(11, 2, '2023-10-26', 1200000, 3);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD CONSTRAINT `detalle_ibfk_1` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`),
  ADD CONSTRAINT `detalle_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`),
  ADD CONSTRAINT `venta_ibfk_3` FOREIGN KEY (`idCliente`) REFERENCES `usuario` (`idUsuario`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
