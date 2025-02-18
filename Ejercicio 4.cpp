#include <stdio.h>

int main() {
    int autos = 0, tiempo, totalMinutos;
    float ingresosTotales = 0;

    printf("Parqueadero AUTOMAN\n");
    printf("---------------------\n");

    char respuesta;
    do {
        printf("Ha ingresado un auto? (s/n): ");
        scanf(" %c", &respuesta);

        if (respuesta == 's') {
            autos++;
            printf("Ingrese tiempo de estacionamiento (minutos): ");
            scanf("%d", &tiempo);

            totalMinutos = tiempo;
            float costo = 0;

            if (totalMinutos <= 60) {
                costo = 2500;
            } else {
                costo = 2500 + ((totalMinutos - 60) / 60) * 1000;
                if ((totalMinutos - 60) % 60 > 0) {
                    costo += 150;
                }
            }

            ingresosTotales += costo;
            printf("Costo: $%.2f\n", costo);
        }
    } while (respuesta == 's');

    printf("\nResumen del dia:\n");
    printf("Total autos: %d\n", autos);
    printf("Ingresos totales: $%.2f\n", ingresosTotales);

return 0;
}