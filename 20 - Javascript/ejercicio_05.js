var num1 = parseInt(prompt("Ingrese el primer número:"));
var num2 = parseInt(prompt("Ingrese el segundo número:"));
var operacion = prompt("Ingrese la operación a realizar ('S' para suma, 'R' para resta, 'M' para multiplicación, 'D' para división)").toLowerCase();

switch (operacion) {
  case 's':
    alert("El resultado de la suma es: " + (num1 + num2));
    break;
  case 'r':
    alert("El resultado de la resta es: " + (num1 - num2));
    break;
  case 'm':
    alert("El resultado de la multiplicación es: " + (num1 * num2));
    break;
  case 'd':
    alert("El resultado de la división es: " + (num1 / num2));
    break;
  default:
    alert("Operación inválida");
    break;
}
