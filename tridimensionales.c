#include <stdio.h>
#include <math.h>
#include "utilitarios.h"
#ifndef TRIDIMENSIONALES_H
#define TRIDIMENSIONALES_H
#define PI 3.1415

//SUPERFICIE DEL CUBO - Jaime
float cubo_superficie(){
    float lado, superficie;
    printf("Ingrese el lado del cubo en Cm: \n");
    scanf("%f", &lado);
    superficie = 6 * (lado*lado);
    printf("El area del cubo es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//AREA DEL CILINDRO - Jaime
float cilindro_superficie(){
    float radio, altura, superficie;
    altura = validacion("Ingrese la altura en Cm: \n");
    radio = validacion("Ingrese el radio en Cm: \n");
    superficie = (2*PI)*(altura+radio);
    printf("El area del cilindro es: %.2f Cm cuadrados \n", superficie);
    return superficie;
    }

//SUPERFICIE DEL CONO - Jaime
float cono_superficie(){
    float radio, altura, g, superficie;
    radio = validacion("Ingrese el radio en Cm: \n");
    altura = validacion("Ingrese la altura en Cm: \n");
    g = sqrt((altura*altura) + (radio*radio));
    superficie = PI*radio*(g = radio);
    printf("El area del cono es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//SUPERFICIE DE LA ESFERA - Jaime
float esfera_superficie(){
    float radio, superficie;
    radio = validacion("Ingrese el radio en Cm: \n");
    superficie = 4*PI*(radio*radio);
    printf("El area de la esfera es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//SUPERFICIE DE HEMIESFERA - Jaime
float hemiesfera_superficie(){
    float radio, superficie;
    radio = validacion("Ingrese el radio en Cm: \n");
    superficie = 3*PI*(radio*radio);
    printf("El area de la hemiesfera es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//SUPERFICIE DE PIRAMIDE CUADRADA - Jaime
float piramide_cuadrada(){
    float lado, altura, superficie;
    lado = validacion("Ingrese el valor de un lado en Cm: \n");
    altura = validacion("Ingrese la altura en Cm: \n");
    superficie = (lado*lado)+4*0.5*lado*sqrt((lado*lado)/4+(altura*altura));
    printf("El area de la piramide cuadrada es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

//SUPERFICIE DEL PRISMA RECTANGULAR - Jaime
float prisma_rectangular(){
    float l_1, l_2, l_3, superficie;
    l_1 = validacion("Ingrese el primer lado del prisma en Cm: \n");
    l_2 = validacion("Ingrese el segundo lado del prisma en Cm: \n");
    l_3 = validacion("Ingrese el tercer lado del prisma en Cm: \n");
    superficie = 2*(l_1*l_2+l_2*l_3+l_1*l_3);
    printf("El area del prisma rectangular es: %.2f Cm cuadrados \n", superficie);
    return superficie;
}

#endif 