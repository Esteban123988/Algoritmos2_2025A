public class ParMayorProducto {

    public static void main(String[] args) {
        int[] enteros2 = {4, 5, 8, 1, 6, 3, 2, 1};
        int[] resultado = encontrarParMayorProducto(enteros2);
        
        System.out.println("El par con el mayor producto es: (" + resultado[0] + ", " + resultado[1] + ")");
        System.out.println("El mayor producto es: " + (resultado[0] * resultado[1]));
    }

    public static int[] encontrarParMayorProducto(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("El arreglo debe contener al menos dos elementos.");
        }

        int maxProducto = arr[0] * arr[1];
        int[] par = {arr[0], arr[1]};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int producto = arr[i] * arr[j];
                if (producto > maxProducto) {
                    maxProducto = producto;
                    par[0] = arr[i];
                    par[1] = arr[j];
                }
            }
        }

        return par;
    }
}