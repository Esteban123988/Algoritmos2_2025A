#include <iostream>
using namespace std;

int main() {
    int numEstudiantes;
    int hombres = 0;
    int mujeres = 0;
    int noIdentificados = 0;

    cout << "Ingrese el número de estudiantes: ";
    cin >> numEstudiantes;

    for (int i = 0; i < numEstudiantes; i++) {
        int genero;
        cout << "Estudiante " << i + 1 << ": " << endl;
        cout << "1. Hombre" << endl;
        cout << "2. Mujer" << endl;
        cout << "3. No identificado" << endl;
        cout << "Ingrese el género (1, 2 o 3): ";
        cin >> genero;

        switch (genero) {
            case 1:
                hombres++;
                break;
            case 2:
                mujeres++;
                break;
            case 3:
                noIdentificados++;
                break;
            default:
                cout << "Género inválido. No se registrará." << endl;
        }
    }

    cout << endl;
    cout << "Resultados:" << endl;
    cout << "Hombres: " << hombres << endl;
    cout << "Mujeres: " << mujeres << endl;
    cout << "No identificados: " << noIdentificados << endl;

    return 0;
}