Algoritmo sin_titulo
//	Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura 
//	m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya 
//	pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El 
//	programa pedir� el n�mero de d�as que se van a introducir.
	definir dias Como Entero
	escribir "Ingrese dias"
	leer dias
	calcularMedia(dias)
FinAlgoritmo
 
SubProceso calcularMedia(dias)
	definir min, max Como Real
	definir i como entero
Para i=0 Hasta dias-1 Con Paso 1 Hacer
	escribir "Ingrese temperatura minima"
	leer min
	escribir "Ingrese temperatura maxima"
	leer max
	Escribir (min+max)/2
Fin Para
FinSubProceso
