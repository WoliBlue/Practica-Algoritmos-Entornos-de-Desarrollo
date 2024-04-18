package app;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		// Crea mediante un bucle un array de enteros
		// llamado “numeros” con 5 números aleatorios del 1 al 10.
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
        }
				
        // Calcula mediante un bucle el número de fibonacci de los 5 números del array
        // y almacena el resultado en otro array de enteros llamado “resultadoFibonacci”..
        int[] resultadoFibonacci = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }

        // Calcula mediante un bucle el factorial de los 5 números del array y
        // almacena el resultado en otro array de enteros llamado “resultadoFactorial”.
        int[] resultadoFactorial = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }

        // Comprueba mediante un bucle si los 5 números del array son primos o no y 
        // almacena el resultado en otro array de booleanos llamado “resultadoPrimos”.
        boolean[] resultadoPrimos = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.primo(numeros[i]);
        }

       
    }
}
