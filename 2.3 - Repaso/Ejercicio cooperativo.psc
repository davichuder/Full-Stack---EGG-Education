Algoritmo sin_titulo
	definir contador_contrasenia, saldo, peso1, peso2, precio1, precio2, precio3, cantidad_botellas, opcion_num, i, num_azar, tamanio_azar como entero
	definir usuario, usuario_ingresado, contrasenia, contrasenia_ingresada, confirmacion como cadena
	definir login como logico
	
	usuario = "Albus_D"
	contrasenia = "caramelosDeLimon"
	peso1 = 500
	peso2 = 1500
	precio1 = 50
	precio2 = 125
	precio3 = 200
	tamanio_azar = 3000
	
	saldo = 0
	Mientras Verdadero
	
		Hacer
			login = Falso
			contador_contrasenia=0
			Escribir "Ingrese usuario"
			leer usuario_ingresado
			si usuario_ingresado = usuario
				Hacer
					Escribir "Ingrese contraseña"
					leer contrasenia_ingresada 
					si contrasenia_ingresada = contrasenia
						login = Verdadero
					FinSi
					contador_contrasenia = contador_contrasenia + 1
				Mientras Que contrasenia_ingresada<>contrasenia y contador_contrasenia<3
			FinSi
		Mientras Que login = Falso
		
		Hacer
			Escribir "Elija una opcion numerica"
			Escribir "1 - Ingresar botellas"
			escribir "2 - Consultar Saldo"
			escribir "3 - Salir"
			leer opcion_num
			
			Segun opcion_num Hacer
				1:
					Escribir "Ingresar cantidad de botellas:"
					leer cantidad_botellas
					para i=0 hasta cantidad_botellas-1
						num_azar = Aleatorio(1, tamanio_azar)
						Escribir "Aceptar botella de ", num_azar, " gr"
						Hacer
							Escribir "Si o No"
							leer confirmacion
							Segun confirmacion Hacer
								"Si":
									si num_azar<peso1
										saldo = saldo + precio1
									FinSi
									si peso1<=num_azar y num_azar<=peso2
										saldo = saldo + precio2
									FinSi
									si peso2<num_azar
										saldo = saldo + precio3
									FinSi
								"No":
									Escribir "Devoldiendo material"
								De Otro Modo:
									Escribir "Responda correctamente"
							Fin Segun
						Mientras Que confirmacion<>"Si" y confirmacion<>"No"
					FinPara
				2:
					Escribir "Saldo: ", saldo
			Fin Segun
		Mientras Que opcion_num<>3
	FinMientras
FinAlgoritmo
