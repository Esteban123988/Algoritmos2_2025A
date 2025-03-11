import java.util.*;

public class Phhdg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.print("Ingrese la cantidad de elementos: ");
        n = scanner.nextInt();
        
        int[] arreglo1 = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        int[] arreglo2 = new int[n];
        int tamaño = 0;
        
        for (int i = 0; i < n; i++) {
            int contador = 0;
            for (int j = 0; j < tamaño; j++) {
                contador += (arreglo1[i] == arreglo2[j]) ? 1 : 0;
            }
            if (contador == 0) {
                arreglo2[tamaño] = arreglo1[i];
                tamaño++;
            }
        }
 
        System.out.print("Arreglo sin duplicados: [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo2[i]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
