#include <stdio.h>

int main() {
    const int numEstudiantes = 20;
    const int meta = 80000;
    const int aporteFijo = 4000;
    int totalRecolectado = 0;
    char respuesta;

    printf("Programa de Recolecta para Pan con Cafe\n");
    printf("Meta: %d pesos\n", meta);
    printf("Aporte fijo por estudiante: %d pesos\n", aporteFijo);

    for (int i = 0; i < numEstudiantes; ++i) {
        printf("Estudiante %d, ¿va a dar dinero? (s/n): ", i + 1);
        scanf(" %c", &respuesta);

        if (respuesta == 's' || respuesta == 'S') {
            totalRecolectado += aporteFijo;
        }

        if (totalRecolectado >= meta) {
            break;
        }
    }

    printf("\nTotal recolectado: %d pesos\n", totalRecolectado);

    if (totalRecolectado >= meta) {
        printf("¡Meta alcanzada! Se ha recolectado suficiente dinero.\n");
    } else {
        printf("Faltan %d pesos para alcanzar la meta.\n", meta - totalRecolectado);
    }

    return 0;
}