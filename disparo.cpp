#include <stdio.h>

double CalcDistanciaCentral(double x, double y) {
    return sqrtAprox(x * x + y * y);
}

int main() {
    double x, y, radio;

    // Pedir el radio del círculo
    printf("Ingrese el radio del círculo: ");
    scanf("%lf", &radio);

    // Pedir las coordenadas del disparo
    printf("Ingrese las coordenadas del disparo (x y): ");
    scanf("%lf %lf", &x, &y);

    // Calcular la distancia al centro
    double distancia = CalcDistanciaCentral(x, y);

    // Mostrar la distancia calculada
    printf("Distancia al centro: %.2f\n", distancia);

    // Determinar si el disparo está dentro o fuera del círculo
    if (distancia <= radio) {
        printf("El disparo está DENTRO del círculo.\n");
    } else {
        printf("El disparo está FUERA del círculo.\n");
    }

    return 0;
}