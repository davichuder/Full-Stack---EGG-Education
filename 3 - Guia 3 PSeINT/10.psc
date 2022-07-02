Algoritmo sin_titulo
//	Escribir una función recursiva que devuelva la suma de los primeros N enteros
	definir num Como Entero
	Escribir "Ingrese un numero"
	leer num
	Escribir suma(num)
	escribir sumaR(num)
FinAlgoritmo

SubProceso resultado<-suma(num)
	definir resultado como entero
	si num>0
		resultado = num + suma(num-1)
	FinSi
FinSubProceso

Funcion suma2<-sumaR(num)
	Definir suma2 Como Entero
	Si num=1 Entonces
		suma2 = 1
	SiNo
		suma2=  num + sumaR(num-1)
	Fin Si
Fin Funcion

	