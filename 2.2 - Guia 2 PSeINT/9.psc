Algoritmo sin_titulo
	definir num, i, j como entero
	definir cad como cadena
	escribir "Tamaño del cuadrado"
	leer num
	cad = ""
	para i=0 hasta num-1
		para j=0 hasta num-1
			si j=0 o j=num-1 o i=0 o i=num-1
				cad = cad + "*"
			SiNo
				cad = cad + " "
			FinSi
		FinPara
		escribir cad
		cad = ""
	FinPara
	
FinAlgoritmo
