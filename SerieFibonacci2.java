import java.util.Scanner;

public class SerieFibonacci2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de términos de la serie Fibonacci:");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("El número de términos debe ser al menos 2.");
            return;
        }
        
        System.out.println("Ingrese el primer número de la serie Fibonacci:");
        int first = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número de la serie Fibonacci:");
        int second = scanner.nextInt();
        
        int[] fibonacci = new int[n];
        generarFibonacci(fibonacci, n, first, second);
        
        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }

    public static void generarFibonacci(int[] fibonacci, int n, int first, int second) {
        fibonacci[0] = first;
        fibonacci[1] = second;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
}