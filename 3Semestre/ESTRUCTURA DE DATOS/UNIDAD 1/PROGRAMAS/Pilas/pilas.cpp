#include <stdio.h>  
#include <stdlib.h> // Librería estándar para funciones de gestión de memoria dinámica (como malloc y free)

// Definición de la estructura de un nodo de la pila
typedef struct nodo_s
{
    char dato;                   // Campo para almacenar el dato del nodo (en este caso, un carácter)
    struct nodo_s *siguiente;    // Puntero que apunta al siguiente nodo en la pila
} nodo_t;                        // Alias de la estructura como "nodo_t"

// Definición de punteros para manejar los nodos y la pila

typedef nodo_t *ptrNodo;         // "ptrNodo" es un puntero a un nodo
typedef nodo_t *ptrPila;         // "ptrPila" es un puntero que apunta al nodo superior de la pila

// Función para insertar un nuevo nodo (push) en la pila
void push(ptrPila *pila, char x)
{
    ptrNodo nodo;                                // Declara un nuevo puntero para el nodo
    nodo = (ptrNodo)malloc(sizeof(nodo_t));      // Asigna memoria dinámica para el nuevo nodo
    if (nodo != NULL)                            // Verifica si la asignación de memoria fue exitosa
    {
        nodo->dato = x;                          // Asigna el valor (carácter) al nuevo nodo
        nodo->siguiente = *pila;                 // Apunta el nuevo nodo al nodo anterior (top de la pila)
        *pila = nodo;                            // Actualiza el puntero de la pila para que apunte al nuevo nodo (nuevo top)
    }
}

// Función para eliminar el nodo superior de la pila (pop) y retornar su valor
char pop(ptrPila *pila)
{
     ptrNodo nodo;                               // Puntero temporal para el nodo que será eliminado
     char x;                                     // Variable para almacenar el dato del nodo eliminado
     nodo = *pila;                               // Nodo temporal apunta al nodo superior de la pila
     x = (*pila)->dato;                          // Almacena el valor del nodo superior en 'x'
     *pila = (*pila)->siguiente;                 // Mueve el puntero de la pila al siguiente nodo
     free(nodo);                                 // Libera la memoria del nodo eliminado
     return x;                                   // Retorna el valor del nodo eliminado
}

// Función que verifica si la pila está vacía
int pila_vacia(ptrPila *pila)
{
    return (*pila == NULL ? 1 : 0);              // Retorna 1 si la pila está vacía, 0 si no lo está
}

// Función que recorre y muestra los elementos de la pila
void nodos_pila(ptrNodo nodo)
{
    if(nodo == NULL)                             // Verifica si la pila está vacía
        printf("La pila está vacía\n");          // Mensaje si la pila está vacía
    else
    {
        while (nodo != NULL)                     // Mientras haya nodos en la pila
        {
            printf("%c ", nodo->dato);           // Muestra el valor del nodo actual
            nodo = nodo->siguiente;              // Avanza al siguiente nodo en la pila
        }
        printf("\n");                            // Nueva línea después de mostrar todos los nodos
    }
}

// Función principal
int main()
{
    ptrPila pila = NULL;                         // Inicializa la pila como vacía (NULL)
    printf("Haciendo push: Hola\n");             // Mensaje de inserción de datos
    push(&pila, 'H');                            // Inserta 'H' en la pila
    push(&pila, 'o');                            // Inserta 'o' en la pila
    push(&pila, 'l');                            // Inserta 'l' en la pila
    push(&pila, 'a');                            // Inserta 'a' en la pila
    
    printf("Recorriendo la pila\n");             // Mensaje indicando que se va a recorrer la pila
    nodos_pila(pila);                            // Llama a la función para mostrar los elementos de la pila
    
    for (int i = 0; i < 4; i++)                  // Bucle para hacer 4 operaciones pop
    {
        printf("Haciendo pop: %c \n", pop(&pila)); // Elimina y muestra cada valor sacado de la pila
    }
    
    if (pila_vacia(&pila))                       // Verifica si la pila está vacía
    {
        printf("La pila está vacía\n");          // Muestra mensaje si la pila está vacía
    }

    return 0;                                    // Fin del programa
}
