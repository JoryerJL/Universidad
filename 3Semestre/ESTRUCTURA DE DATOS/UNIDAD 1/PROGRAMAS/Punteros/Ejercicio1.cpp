#include <iostream>
using namespace std;

void cambioValores ( int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    int a, b;
    int *pA, *pB;
    cout <<"EJERICICIO 1";
    cout << "\nIngrese el primer numero: ";
    cin >> a;
    pA = &a;
    pB = &b;
    cout << "\nIngrese el segundo numero: ";
    cin >> b;

    cout << "\nVALOR DEL NUMERO 1 : " <<*pA;
    cout<< "\nPOSICION DEL NUMERO 1 : " <<pA;
    cout << "\nVALOR DEL NUMERO 2 : " <<*pB;
    cout<< "\nPOSICION DEL NUMERO 2 : " <<pB;
    cout << "\n\nIntercambio de valores";
    cambioValores(pA, pB);

    cout << "\nVALOR DEL NUMERO 1 : " <<*pA;
    cout<< "\nPOSICION DEL NUMERO 1 : " <<pA;
    cout << "\nVALOR DEL NUMERO 2 : " <<*pB;
    cout<< "\nPOSICION DEL NUMERO 2 : " <<pB;

    *pA = 200;
    cout<<"\n" <<a;

    return 0;

    // Intercambio de valores

}
