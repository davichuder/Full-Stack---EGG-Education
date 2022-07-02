Algoritmo sin_titulo
	definir sueldo_base, comision, cobro_venta, comision_ventas Como Real
	definir i, cantidad_ventas Como Entero
	escribir "Sueldo base"
	leer sueldo_base
	Escribir "Cantidad de ventas"
	leer cantidad_ventas
	comision = 0.1
	comision_ventas = 0
	para i=0 hasta cantidad_ventas-1
		Escribir "Cobro de venta N° "
		leer cobro_venta
		comision_ventas = comision_ventas + cobro_venta*comision
	FinPara
	Escribir "Comision a pagar es de ", comision_ventas
	escribir "El sueldo a pagar es de ", sueldo_base+comision_ventas
FinAlgoritmo
