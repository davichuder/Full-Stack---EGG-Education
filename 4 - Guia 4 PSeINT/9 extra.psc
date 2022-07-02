Algoritmo sin_titulo
//	Realizar un programa que rellene de números aleatorios una matriz a través de un 
	//	subprograma y generar otro subprograma que muestre por pantalla la matriz final.
	definir matriz, n, m Como Entero
	n = 4
	m = 4
	Dimension  matriz(n, m)
	llenar_matriz(matriz, n, m)
	mostrar_matriz(matriz, n, m)
FinAlgoritmo

SubProceso llenar_matriz(matriz por referencia, n, m)
	Definir i, j Como Entero
	
	para i=0 Hasta n-1
		para j=0 hasta m-1
			matriz[i, j] = Aleatorio(0, 100)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrar_matriz(matriz, n, m)
	Definir i, j Como Entero
	para i=0 Hasta n-1
		para j=0 hasta m-1
			Escribir Sin Saltar matriz[i, j]
			Escribir Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso