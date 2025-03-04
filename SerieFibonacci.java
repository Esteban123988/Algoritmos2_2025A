import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de términos de la serie Fibonacci:");
        int n = scanner.nextInt();
        
        int[] fibonacci = new int[n];
        generarFibonacci(fibonacci, n);
        
        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }

    public static void generarFibonacci(int[] fibonacci, int n) {
        if (n > 0) {
            fibonacci[0] = 1;
        }
        if (n > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
}