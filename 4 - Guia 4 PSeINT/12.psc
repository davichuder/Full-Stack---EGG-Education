//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, 
//encontrando la manera de que la frase se muestre de manera continua en la matriz. 
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así

Algoritmo sin_titulo
	definir palabra como cadena
	definir matriz Como Caracter
	definir i, j, contador Como Entero
	dimension matriz(3, 3)
	
	escribir "Ingrese una palabra de longitud 9"
	leer palabra
	
	contador = 0
	para i=0 hasta 2
		Para j=0 hasta 2
			matriz[i, j] = subcadena(palabra, contador, contador)
			contador = contador + 1
		FinPara
	FinPara
	
	para i=0 hasta 2
		Para j=0 hasta 2
			escribir sin saltar matriz[i, j]
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
