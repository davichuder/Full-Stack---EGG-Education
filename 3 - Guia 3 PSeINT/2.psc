Algoritmo sin_titulo
//	Realizar una función que valide si un número es impar o no. Si es impar la función debe 
//	devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener 
//	mensajes que digan si es par o no, eso debe pasar en el Algoritmo
	definir num Como Entero
	escribir "Ingrese un numero"
	leer num
	Escribir "El numero ingresado es par?", par(num)
FinAlgoritmo

Funcion resultado <- par ( num )
	Definir resultado como logico
	resultado = (num%2 = 0)
Fin Funcion