package Actividades;
import java.util.Scanner;
import java.util.Random;

public class CalcularDistancia2 {

    // Función para calcular la distancia del punto al centro (0,0)
    public static double CalcDistanciaCentral(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar el radio del círculo aleatorio entre 1 y 10
        double radio = 1 + (10 - 1) * random.nextDouble();

        // Generar las coordenadas del centro del círculo aleatorias entre -10 y 10
        double centroX = -10 + (10 - (-10)) * random.nextDouble();
        double centroY = -10 + (10 - (-10)) * random.nextDouble();

        // Mostrar el radio y la posición del centro del círculo
        System.out.printf("Radio del círculo: %.2f%n", radio);
        System.out.printf("Posición del centro del círculo: (%.2f, %.2f)%n", centroX, centroY);

        // Pedir las coordenadas del disparo
        double x = 0, y = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Ingrese las coordenadas del disparo (x y): ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                if (scanner.hasNextDouble()) {
                    y = scanner.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Entrada inválida. Por favor ingrese dos números.");
                    scanner.next(); // Limpiar el buffer
                }
            } else {
                System.out.println("Entrada inválida. Por favor ingrese dos números.");
                scanner.next(); // Limpiar el buffer
            }
        }

        // Calcular la distancia al centro del círculo
        double distancia = CalcDistanciaCentral(x - centroX, y - centroY);

        // Mostrar la distancia calculada
        System.out.printf("Distancia al centro: %.2f%n", distancia);

        // Determinar si el disparo está dentro o fuera del círculo
        if (distancia <= radio) {
            System.out.println("El disparo está dentro del círculo.");
        } else {
            System.out.println("El disparo está FUERA del círculo.");
        }
    }
}
