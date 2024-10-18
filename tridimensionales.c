#include <stdio.h>
#include <math.h>
#ifndef TRIDIMENSIONALES_H
#define TRIDIMENSIONALES_H
#define PI 3.1415

//SUPERFICIE DEL CUBO
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

//AREA DEL CILINDRO
double cilindro_superficie(){
    double radio, altura, superficie;
    printf("Ingrese la altura en Cm: \n");
    scanf("%lf", &altura);
    printf("Ingrese el radio en Cm: \n");
    scanf("%lf", &radio);
    if(radio && altura <= 0){
        printf("Ningun valor puede ser menor o igual a 0");

    } else{
      superficie = (2*PI)*(altura+radio);
      printf("El area del cilindro es: %.2lf Cm cuadrados \n", superficie);
    }
    return superficie;
}
#endif 

