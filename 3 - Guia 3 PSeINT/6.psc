Algoritmo sin_titulo
//	Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero. 
//	La variable A, debe terminar con el valor de la variable B
	definir num1, num2 como entero
	escribir "Ingrese 2 numeros"
	leer num1, num2
	escribir "Num1 ", num1, " Num2 ", num2
	invertir(num1, num2)
	escribir "Num1 ", num1, " Num2 ", num2
FinAlgoritmo

Funcion invertir(numA por referencia, numB por referencia)
	definir aux Como Entero
	aux = numA
	numA = numB
	numB = aux
Fin Funcion