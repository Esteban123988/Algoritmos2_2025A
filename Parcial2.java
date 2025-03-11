import java.util.*;

public class Parcial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el tamaño del arreglo
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();
        
        int[] arreglo1 = new int[n];
        
        // Pedir los elementos al usuario
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo1[i] = scanner.nextInt();
        }
        
        // Crear un segundo arreglo para almacenar elementos sin duplicados
        int[] arreglo2 = new int[n];
        int tamaño = 0;
        
        for (int i = 0; i < n; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < tamaño; j++) {
                if (arreglo1[i] == arreglo2[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                arreglo2[tamaño] = arreglo1[i];
                tamaño++;
            }
        }
        
        // Mostrar el resultado
        System.out.print("Arreglo sin duplicados: [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo2[i]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}
