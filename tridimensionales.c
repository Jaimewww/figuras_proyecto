#include <stdio.h>
#include <math.h>
#include "utilitarios.c"
#ifndef TRIDIMENSIONALES_H
#define TRIDIMENSIONALES_H
#define PI 3.1415

//SUPERFICIE DEL CUBO
float cubo_superficie(){
    float lado, superficie;
    printf("Ingrese el lado del cubo en Cm: \n");
    scanf("%f", &lado);
    superficie = 6 * (lado*lado);
    printf("El area del cubo es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//AREA DEL CILINDRO
float cilindro_superficie(){
    float radio, altura, superficie;
    altura = validacion("Ingrese la altura en Cm: \n");
    radio = validacion("Ingrese el radio en Cm: \n");
    superficie = (2*PI)*(altura+radio);
    printf("El area del cilindro es: %.2f Cm cuadrados \n", superficie);
    return superficie;
    }

//SUPERFICIE DEL CONO
float cono_superficie(){
    float radio, altura, g, superficie;
    radio = validacion("Ingrese el radio en Cm: \n");
    altura = validacion("Ingrese la altura en Cm: \n");
    g = sqrt((altura*altura) + (radio*radio));
    superficie = PI*radio*(g = radio);
    printf("El area del cono es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//SUPERFICIE DE LA ESFERA
float esfera_superficie(){
    float radio, superficie;
    radio = validacion("Ingrese el radio en Cm: \n");
    superficie = 4*PI*(radio*radio);
    printf("El area de la esfera es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//SUPERFICIE DE HEMIESFERA
float hemiesfera_superficie(){
    float radio, superficie;
    radio = validacion("Ingrese el radio en Cm: \n");
    superficie = 3*PI*(radio*radio);
    printf("El area de la hemiesfera es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

#endif 