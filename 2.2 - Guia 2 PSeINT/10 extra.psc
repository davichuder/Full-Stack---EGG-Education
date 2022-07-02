Algoritmo sin_titulo
	definir num, num_aleatorio, limite_inferior, limite_superior, i Como Entero
	limite_inferior = 1
	limite_superior = 10
	num_aleatorio = Aleatorio(limite_inferior, limite_superior)
	Hacer
		escribir "Adivine el numero entre ", limite_inferior, " y ", limite_superior
		Leer num
		si num <> num_aleatorio
			Escribir "Elegiste el numero equivocado"
		FinSi
	Mientras Que num_aleatorio<>num
	Escribir "Elegiste el numero correcto"
FinAlgoritmo