Algoritmo sin_titulo
//	Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que 
//	devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd". 
//	Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos 
//	solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso
	Definir usuario, contrasenia como cadena
	Definir intentos Como Entero
	Escribir "ingrese usuario"
	leer usuario
	Escribir "ingrese contraseña"
	leer contrasenia
	Escribir Login(usuario, contrasenia)
FinAlgoritmo

Funcion resultado<-Login(usuario, contrasenia)
	definir resultado Como Logico
	definir intentos como entero
	resultado = (usuario="usuario1" y contrasenia="asdasd")
	intentos = 1
	Mientras resultado=Falso y intentos<3
		Escribir "ingrese usuario"
		leer usuario
		Escribir "ingrese contraseña"
		leer contrasenia
		resultado = (usuario="usuario1" y contrasenia="asdasd")
		intentos = intentos + 1
	FinMientras
FinFuncion
	