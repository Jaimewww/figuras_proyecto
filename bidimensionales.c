#include <stdio.h>
#include <math.h>
#include "utilitarios.h"
#ifndef BIDIMENSIONALES_H
#define BIDIMENSIONALES_H
#define PI 3.1415

//AREA DEL CIRCULO - Emilio
float circulo_area(){
    float radio_cir, superficie;
    radio_cir = validacion("Ingrese el radio en Cm \n");
    superficie = PI * (radio_cir*radio_cir);
    printf("La superficie del circulo es %.2f Cm cuadrados", superficie);
    return superficie;
}


#endif