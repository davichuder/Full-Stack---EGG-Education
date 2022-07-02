Algoritmo sin_titulo
//	Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
//	terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
//	correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//	NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase
	definir frase como cadena
	escribir "ingrese frase"
	leer frase
	escribir codificacion(frase)
FinAlgoritmo

SubProceso resultado<-codificacion(frase)
	definir resultado como cadena
	definir letra Como Caracter
	definir i como entero
	resultado = ""
	para i=0 hasta Longitud(frase)-1
		letra = Subcadena(frase, i, i)
		Segun letra Hacer
			"a":
				resultado = Concatenar(resultado, "@")
			"e":
				resultado = Concatenar(resultado, "#")
			"i":
				resultado = Concatenar(resultado, "$")
			"o":
				resultado = Concatenar(resultado, "%")
			"u":
				resultado = Concatenar(resultado, "*")
			De Otro Modo:
				resultado = Concatenar(resultado, letra)
		Fin Segun
	FinPara
FinSubProceso
