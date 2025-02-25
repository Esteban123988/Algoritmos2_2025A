import java.util.Scanner;

public class SerieAlternativa
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de términos
        System.out.print("Ingrese la cantidad de términos: ");
        int n = scanner.nextInt();

        // Generar y mostrar la serie
        for (int i = 1; i <= n; i++) {
            int termino = (i % 2 == 0) ? -i : i;
            System.out.print(termino);
            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}