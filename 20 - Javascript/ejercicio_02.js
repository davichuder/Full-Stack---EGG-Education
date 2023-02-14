// Algoritmo para calcular el área y perímetro de una circunferencia en JavaScript

// Constante para el valor de π
const PI = 3.14159265;

// 1. Solicitar al usuario que ingrese el radio de la circunferencia
var radio = prompt("Ingrese el radio de la circunferencia: ");

// 2. Calcular el área y perímetro
var area = PI * Math.pow(radio, 2);
var perimetro = 2 * PI * radio;

// 3. Mostrar el área y perímetro por pantalla
console.log("Área: " + area);
console.log("Perímetro: " + perimetro);
