#include <stdio.h>

int main() {
    const int numEstudiantes = 20;
    const int meta = 80000;
    int totalRecolectado = 0;

    printf("Programa de Recolecta para Pan con Cafe\n");
    printf("Meta: %d pesos\n", meta);
    printf("Ingrese el aporte de cada estudiante:\n");

    for (int i = 0; i < numEstudiantes; ++i) {
        int aporte;
        printf("Aporte del estudiante %d: ", i + 1);
        scanf("%d", &aporte);
        totalRecolectado += aporte;

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