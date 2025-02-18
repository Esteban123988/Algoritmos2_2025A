#include <iostream>
using namespace std;

const int SEMINARIOS = 3;
const int DIAS = 5;

// Función para registrar asistentes
void registrarAsistentes(int matriz[SEMINARIOS][DIAS]) {
    cout << "Ingrese el número de asistentes para cada seminario y día:\n";
    for (int i=0;i<SEMINARIOS;i++) {
        for (int j=0;j<DIAS;j++) {
            cout << "Seminario " << (i+1) << ", Día " << (j+1) << ": ";
            cin >> matriz[i][j];
        }
    }
}

// Función para mostrar los datos registrados
void mostrarDatos(int matriz[SEMINARIOS][DIAS]) {
    cout << "\nAsistentes registrados:\n";
    for (int i=0;i<SEMINARIOS;i++) {
        cout << "Seminario " << (i+1) << ": ";
        for (int j=0;j<DIAS;j++) {
            cout << matriz[i][j] << " ";
        }
 cout << endl;
    }
}

// Función para calcular el total de asistentes por seminario
void totalPorSeminario(int matriz[SEMINARIOS][DIAS]) {
    cout << "\nTotal de asistentes por seminario:\n";
    for (int i=0;i<SEMINARIOS;i++) {
        int total=0;
        for (int j=0;j<DIAS;j++) {
            total += matriz[i][j];
        }
        cout << "Seminario " << (i+1) << ": " << total << " asistentes\n";
    }
}

// Función para calcular el promedio de asistentes por seminario
void promedioPorSeminario(int matriz[SEMINARIOS][DIAS]) {
    cout << "\nPromedio de asistentes por seminario:\n";
    for (int i=0;i<SEMINARIOS;i++) {
        int total=0;
        for (int j=0;j<DIAS;j++) {
            total += matriz[i][j];
        }
        double promedio = total / (double)DIAS; 
        cout << "Seminario " << (i+1) << ": " << promedio << " asistentes\n";
    }
}

// Función para determinar el seminario y día con mayor cantidad de asistentes
void mayorCantidadAsistentes(int matriz[SEMINARIOS][DIAS]) {
    int maxAsistentes=0, seminarioMax=0, diaMax=0;
    for (int i=0;i<SEMINARIOS;i++) {
        for (int j=0;j<DIAS;j++) {
            if (matriz[i][j]>maxAsistentes) {
                maxAsistentes=matriz[i][j];
                seminarioMax=i;
                diaMax=j;
            }
        }
    }
    cout << "\nEl mayor número de asistentes fue " << maxAsistentes
         << " en el Seminario " << (seminarioMax+1) << ", Día " << (diaMax+1) << ".\n";
}

int main() {
    int asistentes[SEMINARIOS][DIAS] = {
        {30, 25, 21, 15, 12},
        {35, 30, 20, 14, 10},
        {25, 18, 14, 7, 9}
    };

    int opcion;
    do {
        cout << "\nMenú de opciones:\n";
        cout << "1. Registrar asistentes\n";
        cout << "2. Mostrar datos registrados\n";
        cout << "3. Mostrar total de asistentes por seminario\n";
		cout << "4. Mostrar promedio de asistentes por seminario\n";
        cout << "5. Mostrar seminario y día con mayor cantidad de asistentes\n";
        cout << "6. Salir\n";
        cout << "Ingrese una opción: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                registrarAsistentes(asistentes);
                break;
            case 2:
                mostrarDatos(asistentes);
                break;
            case 3:
                totalPorSeminario(asistentes);
                break;
            case 4:
                promedioPorSeminario(asistentes);
                break;
            case 5:
                mayorCantidadAsistentes(asistentes);
                break;
            case 6:
                cout << "Saliendo del programa...\n";
                break;
            default:
                cout << "Opción inválida. Intente de nuevo.\n";
        }
    } while (opcion != 6);

return 0;
}