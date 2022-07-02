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
	
	definir columna, fila Como Entero
	Para fila=0 hasta tamanio-1
		para columna=0 hasta tamanio-1
			hacer
				escribir "Ingrese numero para ", fila, " , " columna
				leer matriz[fila, columna]
				//matriz[fila, columna] = Aleatorio(0, 3)
			Mientras Que matriz[fila, columna]<1 o matriz[fila, columna]>9
		FinPara
	FinPara
	
//	Para fila=0 hasta tamanio-1
//		para columna=0 hasta tamanio-1
//			Escribir Sin Saltar matriz[fila, columna], " "
//		FinPara
//		Escribir ""
//	FinPara
	
	definir suma_fila, suma_columna, suma_diagonal como entero
	Dimension suma_fila(tamanio), suma_columna(tamanio), suma_diagonal(2)
	
	Para fila=0 hasta tamanio-1
		suma_fila[fila] = 0
		suma_columna[fila] = 0
	FinPara
	suma_diagonal[0] = 0
	suma_diagonal[1] = 0
	
	Para fila=0 hasta tamanio-1
		Para columna=0 hasta tamanio-1
			
			suma_fila[fila] = suma_fila[fila] + matriz[fila, columna]
			
			suma_columna[columna] = suma_columna[columna] + matriz[fila, columna]
			
			si fila = columna
				suma_diagonal[0] = suma_diagonal[0] + matriz[fila, columna]
			FinSi
			
			si columna = tamanio-1-fila
				suma_diagonal[1] = suma_diagonal[1] + matriz[fila, columna]
			FinSi
		FinPara
	FinPara
	
	Para fila=0 hasta tamanio-1
		escribir "fila ", fila, " = ", suma_fila[fila]
		escribir "columna ", fila, " = ", suma_columna[fila]
	FinPara
	Escribir "suma diagonal0 = ", suma_diagonal[0]
	Escribir "suma diagonal1 = ", suma_diagonal[1]
	
	definir fila_logico, columna_logico, diagonal_logico, todo_logico Como Logico
	
	para fila=1 hasta tamanio-1
		si suma_fila[fila] = suma_fila[0] Entonces
			fila_logico = Verdadero
		SiNo
			fila_logico = Falso
			fila=tamanio
		FinSi
	FinPara
	
	Para columna=1 hasta tamanio-1
		si suma_columna[columna] = suma_columna[0] Entonces
			columna_logico = Verdadero
		SiNo
			columna_logico = Falso
			columna=tamanio
		FinSi
	FinPara
	
	diagonal_logico = suma_diagonal[0]=suma_diagonal[1]
	todo_logico = (suma_diagonal[0]=suma_fila[0] y suma_fila[0]=suma_columna[0])
	
	
	si fila_logico=columna_logico y columna_logico=diagonal_logico y todo_logico Entonces
		Escribir "Es una matriz magica"
	SiNo
		Escribir "No es una matriz magica"
	FinSi
	
	
FinAlgoritmo
