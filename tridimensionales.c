#include <stdio.h>
#include <math.h>
#ifndef TRIDIMENSIONALES_H
#define TRIDIMENSIONALES_H
#define PI 3.1415

double cubo_superficie(){
    double lado, superficie;
    printf("Ingrese el lado del cubo en Cm: \n");
    scanf("%lf", &lado);

    if(lado <= 0){
        printf("El valor del lado no puede ser 0 o menor a 0");
        return 1;

    } else{
         superficie = 6 * (lado*lado);
        printf("El area del cubo es: %.2lf cm² \n", superficie);
    }
    return superficie;
}

#endif 
// tener en cuenta el archivo - objeto java 
// c - estructurada 
