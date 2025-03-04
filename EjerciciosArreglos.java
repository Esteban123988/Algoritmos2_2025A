import java.util.Scanner;

public class EjerciciosArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarar arreglo enteros
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        
        // Encontrar el entero que falta
        int n = enteros.length + 1;
        int numeroPerdido = encontrarNumeroPerdido(enteros, n);
        
        System.out.println("El número perdido es: " + numeroPerdido);
        
        scanner.close();
    }

    public static int encontrarNumeroPerdido(int[] arr, int n) {
        int sumaEsperada = (n * (n + 1)) / 2; 
        int sumaReal = 0;
        for (int num : arr) {
            sumaReal += num;
        }
        return sumaEsperada - sumaReal;
    }
}