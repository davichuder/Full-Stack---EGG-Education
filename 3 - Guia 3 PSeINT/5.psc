Algoritmo sin_titulo
//	Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es 
//	primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2, 
//	3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	definir num Como Entero
	escribir "Ingrese un numero natural"
	leer num
	Escribir "El numero es primo?", esPrimo(num)
FinAlgoritmo

Funcion resultado <- esPrimo(num)
	definir resultado Como Logico
	definir contador, i Como Entero
	contador = 0
	i = 1
	Hacer
		si num%i=0
			contador = contador +1
		FinSi
		i = i + 1
	Mientras Que contador<3 y i<=num
	resultado = (contador<3)
Fin Funcion