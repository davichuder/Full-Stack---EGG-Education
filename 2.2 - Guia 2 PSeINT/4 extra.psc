Algoritmo sin_titulo
	Definir nombre como cadena
	definir nota, suma_notas Como Real
	definir i Como Entero
	escribir "Ingrese nombre"
	leer nombre
	nota = 5
	Hacer
		suma_notas = 0
		Para i=0 hasta 2
			Segun i Hacer
				0:
					Escribir "Nota de practicas"
					leer nota
				1:
					Escribir "Nota de problemas"
					leer nota
				2:
					Escribir "Nota de teoria"
					leer nota
			Fin Segun
			si 1<nota y nota<10
				Segun i Hacer
					0:
						suma_notas = suma_notas + nota*0.1
					1:
						suma_notas = suma_notas + nota*0.5
					2:
						suma_notas = suma_notas + nota*0.4
				FinSegun
				
			SiNo
				Escribir "ERROR 404"
				i = 4
			FinSi
		FinPara
		si suma_notas>3
			Escribir "Nota Final ", suma_notas
		FinSi
		escribir "Ingrese nombre"
		leer nombre
	Mientras Que nombre<>""
FinAlgoritmo
