Algoritmo sin_titulo
	//Programe una función que calcule el producto de un arreglo de números enteros. Para esto 
//		imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es 
	//			igual a (V[1]*V[2]*V[3]*V[4])
	definir vector, multiplicacion, i, tamanio como entero
	tamanio = 3
	Dimension vector(tamanio)
	llenar_vector(vector, tamanio)
	multiplicacion = multiplicacion_vector(vector, tamanio)
	Escribir multiplicacion
FinAlgoritmo

SubProceso llenar_vector(vector por referencia, tamanio)
	definir i Como Entero
	para i=0 hasta tamanio-1
		vector[i] = aleatorio(0,100)
		Escribir vector[i]
	FinPara
FinSubProceso

SubProceso multiplicacion = multiplicacion_vector(vector, tamanio)
	definir multiplicacion Como Entero
	multiplicacion = 1
	tamanio = tamanio-1
	si tamanio=0
		multiplicacion = vector[tamanio]
	sino
		multiplicacion = vector[tamanio]*multiplicacion_vector(vector, tamanio)
	FinSi
	
FinSubProceso