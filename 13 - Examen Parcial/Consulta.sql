-- Active: 1665703324796@@localhost@3306@nba
USE nba;
-- CANDADO A 
-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s: 
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
SELECT COUNT(*)
FROM estadistica
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido)
                                FROM estadistica);
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) 
-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos: 
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.
SELECT SUM(j.peso)
FROM jugador as j
INNER JOIN equipo as e
ON j.nombre_equipo = e.nombre
WHERE e.conferencia = "East" AND j.posicion LIKE "%C%";
-- A -> [2, 14043]

-- CANDADO B 
-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s: 
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat.  
SELECT * FROM jugador;
SELECT * FROM estadistica;
SELECT COUNT(*)
FROM estadistica
WHERE Asistencias_por_partido > (SELECT COUNT(*) FROM jugador WHERE nombre_equipo = "Heat");
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) 
-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos: 
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT count(*)
FROM partido
WHERE temporada LIKE "%99%";
-- [3, 3480]

-- CANDADO C 
-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s 
-- siguiente/s consulta/s: 
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman 
-- parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
SELECT COUNT(*)
FROM jugador as j
INNER JOIN equipo as e
ON j.nombre_equipo = e.nombre
WHERE j.procedencia LIKE "%Michigan%" AND e.conferencia = "West";

SELECT COUNT(*)
FROM jugador
WHERE peso >= 195;
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)
-- Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar:
-- el promedio de puntos por partido,
SELECT AVG(Puntos_por_partido) FROM estadistica;
-- el conteo de asistencias por partido,
SELECT COUNT(Asistencias_por_partido) FROM estadistica;
-- y la suma de tapones por partido.
SELECT SUM(Tapones_por_partido) FROM estadistica;
-- Además, este resultado debe ser, donde la división sea central.
SELECT (AVG(e.Puntos_por_partido)+COUNT(e.Asistencias_por_partido)+SUM(e.Tapones_por_partido))
FROM estadistica as e
INNER JOIN jugador as j
ON e.jugador = j.codigo
INNER JOIN equipo as eq
ON j.nombre_equipo = eq.nombre
WHERE eq.division = "Central";
-- [1, 631]

-- CANDADO D 
-- Posición:  El candado D está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:  
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01.
SELECT SUM(e.Tapones_por_partido)
FROM estadistica as e
INNER JOIN jugador as j
ON e.jugador = j.codigo
WHERE j.nombre = "Corey Maggette" AND e.temporada = "00/01";
-- Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4) 
-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos:  
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido 
-- de todos los jugadores de procedencia argentina.
SELECT SUM(e.Puntos_por_partido)
FROM estadistica as e
INNER JOIN jugador as j
ON e.jugador = j.codigo
WHERE j.procedencia = "Argentina";
-- [4, 191]