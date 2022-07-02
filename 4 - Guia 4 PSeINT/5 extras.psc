Algoritmo sin_titulo
//	Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando 
//	un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la 
//	posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n 
//	o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter 
//	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio 
//	más cercano
	definir frase como cadena
	definir vector, char como caracter
	dimension vector(20)
	Definir posicion Como Entero
	
	Escribir "Ingrese una frase con 20 o menos caracteres"
	leer frase
	
	si longitud(frase)<20
		llenar_vector(frase, vector)
		Escribir "Ingrese una posicion"
		leer posicion
		Escribir "Ingrese un caracter"
		leer char
		mover_vector(vector, char, posicion, longitud(frase))
		mostrar_vector(vector, longitud(frase))
	sino	
		Escribir "Error: frase muy larga"
	FinSi
FinAlgoritmo

SubProceso llenar_vector(frase, vector por referencia)
	definir i como entero
	para i=0 hasta Longitud(frase)-1
		vector[i] = Subcadena(frase, i, i)
	FinPara
FinSubProceso

SubProceso mover_vector(vector Por Referencia, char, posicion, largo)
	definir i como entero
	para i=largo hasta posicion
		si i=posicion
			vector[i] = char
		sino
			vector[i] = vector[i-1]
		FinSi
	FinPara
FinSubProceso

SubProceso mostrar_vector(vector, largo)
	Definir i Como Entero
	para i=0 Hasta largo
		Escribir Sin Saltar vector[i]
	FinPara
FinSubProceso
	