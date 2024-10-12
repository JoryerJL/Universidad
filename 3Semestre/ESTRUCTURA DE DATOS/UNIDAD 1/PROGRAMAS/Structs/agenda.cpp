#include <iostream>
#include <list>
#include <string>

using namespace std;

typedef string Texto;

struct Cita {
    Texto titulo;
    Texto descripcion;
    Texto fecha;
    Texto hora;
};

typedef list<Cita> Agenda;

void agregarCita(Agenda &agenda) {
    Cita nuevaCita;
    
    cout << "Ingrese el título de la cita: ";
    getline(cin, nuevaCita.titulo);
    
    cout << "Ingrese la descripción de la cita: ";
    getline(cin, nuevaCita.descripcion);
    
    cout << "Ingrese la fecha (DD/MM/AAAA): ";
    getline(cin, nuevaCita.fecha);
    
    cout << "Ingrese la hora (HH:MM): ";
    getline(cin, nuevaCita.hora);
    
    agenda.push_back(nuevaCita);
    cout << "\nCita agregada con éxito.\n";
}

void mostrarCitas(const Agenda &agenda) {
    if (agenda.empty()) {
        cout << "\nNo hay citas en la agenda.\n";
        return;
    }
    
    cout << "\nCitas en la agenda:\n";
    int i = 1;
    for (const auto &cita : agenda) {
        cout << "\nCita " << i++ << ":\n";
        cout << "Título: " << cita.titulo << endl;
        cout << "Descripción: " << cita.descripcion << endl;
        cout << "Fecha: " << cita.fecha << endl;
        cout << "Hora: " << cita.hora << endl;
    }
}

int main() {
    Agenda agenda;  // Creamos una agenda
    int opcion;
    
    do {
        cout << "\n--- Agenda ---\n";
        cout << "1. Agregar cita\n";
        cout << "2. Mostrar citas\n";
        cout << "3. Salir\n";
        cout << "Seleccione una opción: ";
        cin >> opcion;
        cin.ignore();
        
        switch(opcion) {
            case 1:
                agregarCita(agenda);
                break;
            case 2:
                mostrarCitas(agenda);
                break;
            case 3:
                cout << "Saliendo...\n";
                break;
            default:
                cout << "Opción inválida. Intente nuevamente.\n";
        }
    } while (opcion != 3);
    
    return 0;
}
