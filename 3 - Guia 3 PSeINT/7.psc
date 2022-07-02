Algoritmo sin_titulo
//	Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura 
//	máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya 
//	pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El 
//	programa pedirá el número de días que se van a introducir.
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
