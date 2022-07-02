Algoritmo sin_titulo
//	Realizar una función que calcule y retorne la suma de todos los divisores del número n 
//	distintos de n. El valor de n debe ser ingresado por el usuario.
	definir num como entero
	escribir "Ingrese un numero"
	leer num
	escribir "Las suma de los divisores es ", suma_de_divisores(num)
	
FinAlgoritmo

Funcion resultado<-suma_de_divisores(num)
	definir i, resultado Como Entero
	resultado = 0
	Para i=1 hasta num-1 
		si num%i=0
			resultado = resultado + i
		FinSi
	FinPara
FinFuncion
	