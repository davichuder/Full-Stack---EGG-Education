Algoritmo sin_titulo
	//Programe una función recursiva que calcule la suma de un arreglo de números entero
	definir vector, suma, i, tamanio como entero
	tamanio = 3
	Dimension vector(tamanio)
	llenar_vector(vector, tamanio)
	suma = suma_vector(vector, tamanio)
	Escribir suma
FinAlgoritmo

SubProceso llenar_vector(vector por referencia, tamanio)
	definir i Como Entero
	para i=0 hasta tamanio-1
		vector[i] = aleatorio(0,100)
		Escribir vector[i]
	FinPara
FinSubProceso

SubProceso suma = suma_vector(vector, tamanio)
	definir suma Como Entero
	suma = 0
	tamanio = tamanio-1
	si tamanio=0
		suma = vector[tamanio]
	sino
		suma = vector[tamanio] + suma_vector(vector, tamanio)
	FinSi
	
FinSubProceso
	