Algoritmo sin_titulo
//	Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe 
//	devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener 
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