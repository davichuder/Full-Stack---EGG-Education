Algoritmo sin_titulo
//	Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y su valor más grande.
	definir vector, i, tamanio Como Entero
	tamanio = 100
	dimension vector(tamanio)
	para i=0 hasta tamanio-1
		vector[i] = aleatorio(0,10000)
	FinPara
	diferencia(vector, tamanio)
FinAlgoritmo

SubProceso diferencia(vector, tamanio)
	definir max, min, i Como Entero
	max = vector[0]
	min = vector[0]
	para i=1 Hasta tamanio-1
		si vector[i]>max
			max = vector[i]
		FinSi
		si vector[i]<min
			min = vector[i]
		FinSi
	FinPara
	Escribir "Max ", max
	Escribir "Min ", min
	Escribir "Diferencia ", max-min
FinSubProceso
	