let limite = parseInt(prompt("Ingrese el valor límite:"));
let suma = 0;
let numero = 0;

while (suma <= limite) {
  numero = parseInt(prompt("Ingrese un número:"));
  suma += numero;
}

alert("La suma superó el límite: " + suma);
