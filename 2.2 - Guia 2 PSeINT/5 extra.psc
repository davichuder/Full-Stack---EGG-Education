Algoritmo sin_titulo
	definir num, digitos Como Entero
	definir num_aux Como Real
	
	escribir "ingrese numero"
	leer num
	
	digitos = 0
	
	Hacer
		si digitos = 0
			num_aux = num/10
		sino
			num_aux = num_aux/10
		FinSi
		digitos = digitos + 1
	Mientras Que num_aux>=1
	
	escribir "Digitos ", digitos
	
FinAlgoritmo