#include <iostream>
using namespace std;
struct Nodo {
    string link;
    Nodo *siguiente;
};

void push (Nodo *&pila, string pLink){
    Nodo *new_nodo = new Nodo();
    new_nodo->link = pLink;
    new_nodo->siguiente = pila;
    pila = new_nodo;

    cout << "Estas en: " <<pLink <<endl;
}

void pop (Nodo *&pila){
    if (pila == NULL)
        cout << "No hay URLs en el historial." << endl;
    else {
        Nodo *aux = pila;
        pila = pila->siguiente;
        delete aux;
    }

}
int main(){
    string url; 
    int opcion;
    Nodo *pila = NULL;
    do
    {
        cout << "\n1. Navegar";
        cout << "\n2. Mostrar historial";
        cout << "\n3. Salir";
        cout << "\nOpcion: ";
        cin >> opcion;

        switch(opcion)
        {
            case 1:
                cout<<"Escribe a la URL que quieres entrar : ";
                cin>>url;
                push(pila, url);
                break;
            case 2:
                cout << "\nHistorial:\n";
                while(pila!=NULL)
                {
                    cout << pila->link << endl;
                    pop(pila);
                }
                break;
            case 3:
                cout << "Saliendo del programa...";
                break;
            default:
                cout << "Opcion invalida. Intente de nuevo.";
        }
    } while (opcion!=3);    
}