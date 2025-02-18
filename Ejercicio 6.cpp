#include <stdio.h>

int main() {
    int numEquipos, numPartidos, goles;
    int totalGoles = 0;
    int i = 1, j = 1;

    printf("Ingrese el número de equipos: ");
    scanf("%d", &numEquipos);

    do {
        printf("Equipo %d\n", i);
        printf("Ingrese el número de partidos jugados: ");
        scanf("%d", &numPartidos);
        j = 1;
        do {
            printf("Ingrese goles marcados en el partido %d: ", j);
            scanf("%d", &goles);
            totalGoles += goles;
            j++;
        } while (j <= numPartidos);
        i++;
    } while (i <= numEquipos);

    printf("\nTotal de goles marcados por todos los equipos: %d\n", totalGoles);

return 0;
}
