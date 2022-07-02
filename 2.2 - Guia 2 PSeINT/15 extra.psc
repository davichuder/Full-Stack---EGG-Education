Algoritmo sin_titulo
	definir i, j, factorial como entero
	factorial=1
	Para i=1 hasta 5
		Escribir sin saltar "!", i, "="
		para j=0 hasta i-1
			Escribir sin saltar j+1
			si j<>i-1
				escribir sin saltar"*"
			FinSi
		FinPara
		factorial=factorial*i
		si i<>1
			Escribir Sin Saltar "=", factorial
		FinSi
		Escribir ""
	FinPara
FinAlgoritmo
