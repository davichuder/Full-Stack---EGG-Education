Algoritmo sin_titulo
//	Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando 
//	que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es 
//	m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
	Definir num1, num2 Como Entero
	escribir "Ingrese 2 numeros"
	leer num1, num2
	Escribir "El primero es multiplo del segundo? ", esMultiplo(num1, num2)
FinAlgoritmo

Funcion resultado <- esMultiplo(num1, num2)
	definir resultado como logico
	resultado = (num1%num2 = 0)
Fin Funcion