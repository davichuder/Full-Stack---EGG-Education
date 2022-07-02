//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que 
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual. 
//Por ejemplo: 
//2 7 6 
//9 5 1 
//4 3 8 
//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un 
//algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que 
//sea mágica escribir la suma. Además, el programa deberá comprobar que los números 
//introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la 
//matriz que no debe superar orden igual a 10. 

Algoritmo sin_titulo
	definir matriz, tamanio como entero
	
	Hacer
		Escribir "Ingrese tamaño"
		leer tamanio 
	Mientras Que tamanio>10
	Dimension matriz(tamanio, tamanio)
	
	ingresarDatos(matriz, tamanio)
	
	comprobarMatriz(matriz, tamanio)
	
FinAlgoritmo

SubProceso ingresarDatos(matriz Por Referencia, tamanio)
	Definir i, j Como Entero
	Para i=0 hasta tamanio-1
		para j=0 hasta tamanio-1
			Escribir "Ingrese valor de fila ", i, " y columna ", j
			Leer matriz[i, j]
		FinPara
	FinPara	
FinSubProceso

SubProceso comprobarMatriz(matriz Por Referencia, tamanio)
	Definir i, j Como Entero
	Definir suma_filas, suma_columnas, suma_diagonales Como Entero
	Dimension suma_filas(tamanio), suma_columnas(tamanio), suma_diagonales(2)
	
	//Inicializo los vectores
	Para i=0 hasta tamanio-1
		suma_filas[i] = 0
		suma_columnas[i] = 0
	FinPara
	suma_diagonales[0] = 0
	suma_diagonales[1] = 0
	
	//Calcular las sumas
	Para i=0 hasta tamanio-1
		para j=0 hasta tamanio-1
			suma_filas[i] = suma_filas[i] + matriz[i, j]
			suma_columnas[j] = suma_columnas[j] + matriz[i, j]
			si i=j
				suma_diagonales[0] = suma_diagonales[0] + matriz[i, j]
			FinSi
			si i+j=tamanio-1
				suma_diagonales[1] = suma_diagonales[1] + matriz[i, j]
			FinSi
		FinPara
	FinPara	
	
	//Defino logicos
	// 0: filas 1: columnas 2:diagonales 3:igualdad
	Definir estado como logico
	Dimension estado(4)
	
	//Iniciar el estado
	Para i=0 hasta 3
		estado[i] = Verdadero
	FinPara
	
	//Comprobacion de filas
	i = 1
	Hacer
		estado[0] = (suma_filas[0]=suma_filas[i])
		i = i+1
	Mientras Que estado[0]=[Verdadero] y i<tamanio
	
	//Comprobacion de columnas
	i = 1
	Hacer
		estado[1] = (suma_columnas[0]=suma_columnas[i])
		i = i+1
	Mientras Que estado[1]=[Verdadero] y i<tamanio
	
	//Comprobacion de las diagonales
	estado[2] = (suma_diagonales[0]=suma_diagonales[1])
	
	//Comprobacion de igualdad
	estado[3] = (suma_filas[0]=suma_columnas[0] y suma_columnas[0]=suma_diagonales[0])
	
	//Mostrar si es igual
	Escribir "La matriz es magica? ", (estado[0] y estado[1] y estado[2] y estado[3])
	
FinSubProceso
