import java.util.Scanner;

public class EjerciciosArreglos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar arreglo enteros
        System.out.println("Ingrese la cantidad de números en la secuencia (incluyendo el faltante):");
        int n = scanner.nextInt();
        
        int[] enteros = new int[n - 1];
        System.out.println("Ingrese los " + (n - 1) + " números de la secuencia:");
        for (int i = 0; i < n - 1; i++) {
            enteros[i] = scanner.nextInt();
        }
        
        // Encontrar el entero que falta
        int numeroPerdido = encontrarNumeroPerdido(enteros, n);
        
        System.out.println("El número perdido es: " + numeroPerdido);
        
        scanner.close();
    }

    public static int encontrarNumeroPerdido(int[] arr, int n) {
        int sumaEsperada = (n * (n + 1)) / 2; // Suma esperada de una secuencia completa
        int sumaReal = 0;
        for (int num : arr) {
            sumaReal += num;
        }
        return sumaEsperada - sumaReal;
    }
}