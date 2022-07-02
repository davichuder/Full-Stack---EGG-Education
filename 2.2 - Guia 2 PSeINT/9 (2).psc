//Algoritmo sin_titulo
//	definir i, j, num Como Entero
//	Definir frase como cadena
//	Escribir "ingrese numero"
//	leer num
//	Para i = 1 hasta num
//		frase = ""
//		para j=1 hasta num
//			si i=1 o i=num entonces
//				frase = concatenar(frase, "*")
//			SiNo
//				si j=1 o j=num Entonces
//					frase = concatenar(frase, "*")
//				sino
//					frase = concatenar(frase, " ")
//				FinSi
//			FinSi
//		FinPara
//		Escribir frase
//	FinPara
//FinAlgoritmo

Algoritmo sin_titulo
	definir i, j, num Como Entero
	Escribir "ingrese numero"
	leer num
	Para i = 1 hasta num
		para j=1 hasta num
			si i=1 o i=num entonces
				Escribir Sin Saltar "*"
			SiNo
				si j=1 o j=num Entonces
					Escribir Sin Saltar "*"
				sino
					Escribir Sin Saltar " "
				FinSi
			FinSi
		FinPara
		escribir ""
	FinPara
FinAlgoritmo
