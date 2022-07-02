Algoritmo sin_titulo
//	Realizar un procedimiento que permita realizar la división entre dos números y muestre el 
//	cociente y el resto utilizando el método de restas sucesivas.
//	El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta 
//	obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas 
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
	definir divisor, devidendo, resto, contador Como Entero
	Escribir "Ingrese 2 numeros"
	leer divisor, devidendo
	contador = 0
	Hacer
		resto = resta(divisor, devidendo)
		contador = contador + 1
		escribir divisor, " ? ", devidendo, " = ", resto, " se realizaron ", contador
		divisor = resto
	Mientras Que resto>=devidendo
	escribir "El resto es ", resto, " y el cociente es ", contador
FinAlgoritmo

SubProceso resto<-resta(divisor Por Valor, devidendo Por Valor)
	Definir resto como entero
	resto = divisor-devidendo	
FinSubProceso
