#include <stdio.h>
#include <math.h>
#ifndef UTILITARIOS_H
#define UTILITARIOS_H
float validacion(const char* mensaje) {
    float numero;
    int validInput;
    do {
        printf("%s", mensaje);
        validInput = scanf("%f", &numero);
        if (validInput != 1) {
            printf("Ingrese un valor numerico valido \n");
            while (getchar() != '\n');
        } else if (numero <= 0) {
            printf("El valor no debe ser menor o igual a 0 \n");
        }
    } while (validInput != 1 || numero <= 0);
    return numero;
}

float cot(float angle) {
    double tangent_value = tan(angle);
    double cotangent_value;
    cotangent_value = 1.0/tangent_value;
    return cotangent_value;
}
#endif