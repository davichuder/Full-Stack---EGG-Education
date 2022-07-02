
Algoritmo recursiva
	definir num  Como Entero
	Escribir "ingrese cantidad de numeros"
	leer num

	Escribir "la suma total es " , sumaR(num)
FinAlgoritmo

Funcion suma <- sumaR(num)
	Definir suma Como Entero
	Si num==1 Entonces
		suma<-1
	SiNo
		suma=num+sumaR(num-1)
	Fin Si
Fin Funcion