-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-02-2023 a las 15:01:21
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `retosofkadb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `naves`
--

CREATE TABLE `naves` (
  `id` bigint(20) NOT NULL,
  `actividad` varchar(255) DEFAULT NULL,
  `combustible` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `pais` varchar(255) NOT NULL,
  `tipo_nave` varchar(255) NOT NULL,
  `imagenurl` varchar(255) DEFAULT NULL,
  `imagen_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `naves`
--

INSERT INTO `naves` (`id`, `actividad`, `combustible`, `nombre`, `pais`, `tipo_nave`, `imagenurl`, `imagen_url`) VALUES
(1, '1966-1975', 'NO4+UDMH', 'apolo', 'EE.UU.', 'nave tripulada', NULL, 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Apollo_17_Command_Module_AS17-145-22261HR.jpg/300px-Apollo_17_Command_Module_AS17-145-22261HR.jpg'),
(2, '2010-act', ' queroseno + oxigeno liquido', 'falcon IX', 'EE.UU.', 'navelanzador', NULL, 'https://upload.wikimedia.org/wikipedia/commons/b/b4/Spaceflight_SSO-A_Mission_%2845257570925%29.jpg'),
(3, '2006-act', 'queroseno + oxigeno liquido', 'soyuz 2', ' rusia', 'navelanzador', NULL, 'https://upload.wikimedia.org/wikipedia/commons/7/73/Soyuz_2_metop.jpg'),
(4, '1973-act', 'queroseno + oxigeno liquido', 'soyuz u', 'rusia', 'navelanzador', NULL, 'https://upload.wikimedia.org/wikipedia/commons/b/b6/Soyuz_18_booster.jpg'),
(5, '2011-act', 'pu02', 'curiosity', 'EE.UU', 'nave no tripulada', NULL, 'https://danielmarin.naukas.com/files/2020/07/Captura-de-pantalla-3.png'),
(6, '1975-act', 'N(comp)+N2H4', 'vikingo I', 'EE.UU', 'nave no tripulada', NULL, 'https://upload.wikimedia.org/wikipedia/commons/7/75/Viking_spacecraft.jpg'),
(7, '2004-act', 'NO4+N2H4He', 'messenger', 'EE.UU', 'nave no tripulada', NULL, 'https://upload.wikimedia.org/wikipedia/commons/a/a5/MESSENGER.jpg'),
(8, '1967 - act', 'NO4+UDMH', 'soyuz', 'rusia', 'nave tripulada', NULL, 'https://upload.wikimedia.org/wikipedia/commons/f/fa/Soyuz_MS.jpg'),
(9, '1999-act', 'N2O4+MMH', 'shenzou', 'china', 'nave tripulada', NULL, 'https://space.skyrocket.de/img_sat/sz-8__2.jpg'),
(10, '1967-1973', 'H(liq) + O(liq)', 'Saturno V', 'EE.UU.', 'Nave lazador', NULL, 'https://austrinus.com/wp-content/uploads/2022/12/saturnv-rocket.jpg'),
(11, '2002-act', 'H(liq)+O(liq)', 'Delta IV', 'E.E.U.U.', 'Nave-lazador', NULL, 'https://upload.wikimedia.org/wikipedia/commons/4/41/NROL-71_Wide_%28cropped_alt%29.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `naves`
--
ALTER TABLE `naves`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `naves`
--
ALTER TABLE `naves`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
