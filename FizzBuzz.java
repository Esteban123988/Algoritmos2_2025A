import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un número entero al usuario
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Evaluar condiciones y mostrar resultado
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Buzz");
        } else if (numero % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(numero);
        }
    }
}