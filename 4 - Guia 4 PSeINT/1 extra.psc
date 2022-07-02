//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los 
//muestre por pantalla.
Algoritmo sin_titulo
	definir vector1, vector2, i, aux Como Entero
	dimension vector1(5), vector2(5)
	para i=0 hasta 4
		aux = Aleatorio(1,9)
		vector1[i] = aux
		vector2[i] = aux
	FinPara
	
	para i=0 hasta 4
		Escribir "V1=",vector1[i], " V2=", vector2[i]
	FinPara
FinAlgoritmo
