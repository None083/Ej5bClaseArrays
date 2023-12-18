/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ej1 {
    
    public static Random random = new Random();

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Ej1

        //Creación de array de double de tamaño 15
        double[] arrayDoubles = new double[15];

        //Rellenar todas las posiciones con 7.5
        Arrays.fill(arrayDoubles, 7.5);

        //Copia del array
        double[] nuevoArrayDoubles = Arrays.copyOf(arrayDoubles, arrayDoubles.length);

        //Imprimir por consola usando toString de la clase Arrays
        System.out.println(Arrays.toString(arrayDoubles));
        System.out.println(Arrays.toString(nuevoArrayDoubles));

        //Compara ambos arrays, mostrando si son iguales
        if (Arrays.compare(arrayDoubles, nuevoArrayDoubles) == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays. 
        //No se usa clase Arrays
        arrayDoubles[random.nextInt(0, arrayDoubles.length + 1)] = 6.3;

        //Imprimir los dos arrays de nuevo
        System.out.println(Arrays.toString(arrayDoubles));
        System.out.println(Arrays.toString(nuevoArrayDoubles));

        //Vuelve a compararlos, indicando si son iguales o no
        if (Arrays.compare(arrayDoubles, nuevoArrayDoubles) == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        System.out.println("--------------------------------------------------");
        //Ej2
        
        //Generar array int con método rellenar aleatorio
        int[] arrayInt = new int[20];
        rellenarAleatorios10a100(arrayInt);
        
        //Ordena el array generado en el apartado anterior de menor a mayor 
        //y muestra el resultado.
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        
        //Pregunta al usuario por un elemento a buscar en el array ordenado. 
        //Usa búsqueda binaria para obtener la posición donde está el elemento.
        System.out.println("Introduce un número a buscar entre 10 y 100");
        int num = teclado.nextInt();
        int resultadoBusqueda = Arrays.binarySearch(arrayInt, num);
        System.out.println("Posición de la búsqueda: " + resultadoBusqueda);
        
    }

    public static void rellenarAleatorios10a100(int[] array) {
        int NUM_MIN = 10;
        int NUM_MAX = 100;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(NUM_MIN, NUM_MAX+1);
        }
    }
    
    

}
