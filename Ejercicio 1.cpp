#include <iostream>

using namespace std;

int main() {
    int cantidadAnimales = 30;
    int edadGatos = 0;
    int edadPerros = 0;
    int cantidadGatos = 0;
    int cantidadPerros = 0;
    int edad;
    int tipoAnimal;

    for (int i = 0; i < cantidadAnimales; i++) {
        cout << "Ingrese el tipo de animal (1: Gato, 2: Perro): ";
        cin >> tipoAnimal;

        cout << "Ingrese la edad del animal: ";
        cin >> edad;

        if (tipoAnimal == 1) {
            edadGatos += edad;
            cantidadGatos++;
        } else if (tipoAnimal == 2) {
            edadPerros += edad;
            cantidadPerros++;
        } else {
            cout << "Tipo de animal inválido. No se registrará." << endl;
        }
    }

    if (cantidadGatos > 0) {
        double promedioEdadGatos = (double)edadGatos / cantidadGatos;
        cout << "Promedio de edad de gatos: " << promedioEdadGatos << endl;
    } else {
        cout << "No se registraron gatos." << endl;
    }

    if (cantidadPerros > 0) {
        double promedioEdadPerros = (double)edadPerros / cantidadPerros;
        cout << "Promedio de edad de perros: " << promedioEdadPerros << endl;
    } else {
        cout << "No se registraron perros." << endl;
    }

    return 0;
}