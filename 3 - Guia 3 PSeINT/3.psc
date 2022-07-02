Algoritmo sin_titulo
//	Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando 
//	que el primer número múltiplo del segundo y devuelva verdadero si el primer número es 
//	múltiplo del segundo, sino es múltiplo que devuelva falso.
	Definir num1, num2 Como Entero
	escribir "Ingrese 2 numeros"
	leer num1, num2
	Escribir "El primero es multiplo del segundo? ", esMultiplo(num1, num2)
FinAlgoritmo

Funcion resultado <- esMultiplo(num1, num2)
	definir resultado como logico
	resultado = (num1%num2 = 0)
Fin Funcion