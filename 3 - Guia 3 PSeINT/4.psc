Algoritmo sin_titulo
//	Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La 
//	función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la 
//	función Subcadena()
	definir frase como cadena
	definir letra Como Caracter
	Escribir "Ingrese una frase"
	leer frase
	Escribir "ingrese una letra"
	leer letra
	Escribir "Se encontro la letra", contarLetras(frase, letra), " veces"
FinAlgoritmo

Funcion cantidad <- contarLetras(frase, letra)
	definir cantidad, i Como Entero
	cantidad = 0
	Para i=0 Hasta longitud(frase)-1 Con Paso 1 Hacer
		Si letra=SubCadena(frase,i,i) Entonces
			cantidad = cantidad + 1
		Fin Si
	Fin Para
Fin Funcion