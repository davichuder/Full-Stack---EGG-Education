Algoritmo sin_titulo
	Definir tablero como caracter
	Dimension tablero[9, 12]
	
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	imprimirMatriz(tablero, 9, 12)
	
	escribir ""
	acomodarPalabras(tablero)
	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo

SubProceso inicializarMatriz(matriz Por Referencia, fila, columna)
	definir i, j Como Entero
	Para i=0 hasta fila-1
		para j=0 hasta columna-1
			matriz[i, j] = "*"
		FinPara
	FinPara		
FinSubProceso 

SubProceso agregarPalabra(matriz Por Referencia, palabra, fila)
	definir i Como Entero
	para i=0 hasta Longitud(palabra)-1
		matriz[fila, i] = Subcadena(palabra, i, i)
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz, filas, columnas)
	Definir i, j Como Entero
	Para i=0 hasta filas-1
		para j=0 hasta columnas-1
			Escribir Sin Saltar matriz[i, j], " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso posicion = buscarR(matriz, fila)
	definir i, posicion Como Entero
	Definir letra Como Caracter
	i=0
	Hacer
		letra = matriz[fila, i]
		i = i+1
	Mientras Que letra <> "r"
	posicion = i-1
FinSubProceso

SubProceso acomodarPalabras(matriz Por Referencia)
	Definir i, j, centro, indice, filas, columnas, diferencia Como Entero
	centro = 5
	filas = 9
	columnas = 12
	
	Para i=0 hasta filas-1
		indice = buscarR(matriz, i)
		para j=columnas-1 hasta 0
			diferencia = (centro-indice)
			si (j-diferencia)>=0
				matriz[i, j] = matriz[i, j-diferencia]
			sino	
				matriz[i, j] = "*"
			FinSi
		FinPara
	FinPara
FinSubProceso
	