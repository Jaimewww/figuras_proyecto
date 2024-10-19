#include <stdio.h>
#ifndef UTITLITARIOS_H
#include <stdbool.h>

float validacion(const char* mensaje){
    float numero;
    int validInput;
    do{
        printf("%s", mensaje);
        validInput = scanf("%f", &numero);
        if(validInput != 1){
            printf("Ingrese un numero valido: \n");
            while (getchar() != '\n');
        } else if(numero <= 0){
            printf("El valor no debe ser menor o igual a 0 \n");
        }
    } while (validInput != 1 || numero <= 0);
    return numero;
}

#endif