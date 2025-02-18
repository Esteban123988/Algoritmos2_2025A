#include <iostream>
using namespace std;

int main() {
    const int CANTIDAD_PERSONAS = 30;

    int alturaMenor = 1000; // Inicializa con un valor alto
    int alturaMayor = 0; // Inicializa con un valor bajo
    int edad, altura;

    for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
        cout << "Persona " << i + 1 << ": " << endl;
        cout << "Ingrese la edad (entre 15 y 45 años): ";
        cin >> edad;

        while (edad < 15 || edad > 45) {
            cout << "Edad inválida. Ingrese nuevamente: ";
            cin >> edad;
        }

        cout << "Ingrese la altura (en cm): ";
        cin >> altura;

        while (altura < 50 || altura > 250) {
            cout << "Altura inválida. Ingrese nuevamente: ";
            cin >> altura;
        }

        if (altura < alturaMenor) {
            alturaMenor = altura;
        }

        if (altura > alturaMayor) {
            alturaMayor = altura;
        }
    }

    cout << endl;
    cout << "Resultados:" << endl;
    cout << "Altura menor: " << alturaMenor << " cm" << endl;
    cout << "Altura mayor: " << alturaMayor << " cm" << endl;

    return 0;
}