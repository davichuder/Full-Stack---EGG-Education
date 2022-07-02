Algoritmo sin_titulo
	Definir cantidad_alumnos, i Como Entero
	definir integrador, exposicion, parcial Como Real
	definir suma_reprobados, cantidad_reprobados como real
	definir cantidad_75 Como Real
	definir max Como Real
	definir cantidad_4_75 Como Real
	
	suma_reprobados = 0
	cantidad_reprobados = 0
	cantidad_75 = 0
	cantidad_4_75 = 0
	max = 0
	
	Escribir "cantidad de alumnos"
	leer cantidad_alumnos
	para i=1 hasta cantidad_alumnos
		Escribir "alumno ", i
		Escribir "integrador"
		leer integrador
		Escribir "exposicion"
		leer exposicion
		Escribir "parcial"
		leer parcial
		si integrador*0.35+exposicion*0.25+parcial*0.4<6.5
			suma_reprobados = suma_reprobados + integrador*0.35+exposicion*0.25+parcial*0.4
			cantidad_reprobados = cantidad_reprobados +1
		FinSi
		si integrador*0.35+exposicion*0.25+parcial*0.4>7.5
			cantidad_75 = cantidad_75 +1
		FinSi
		si integrador*0.35+exposicion*0.25+parcial*0.4>max
			max = integrador*0.35+exposicion*0.25+parcial*0.4
		FinSi
		si 4<integrador*0.35+exposicion*0.25+parcial*0.4 y integrador*0.35+exposicion*0.25+parcial*0.4<7.5
			cantidad_4_75 = cantidad_4_75 + 1
		FinSi
	FinPara
	Escribir "promedio de reprobados", suma_reprobados/cantidad_reprobados
	Escribir "porcentaje con nota mayor a 7.5: ", cantidad_75/cantidad_alumnos
	escribir "mayor nota", max
	Escribir "total con nota entre 4 y 7.5: ", cantidad_4_75
FinAlgoritmo
