#include <stdio.h>
#include <math.h>
#include "utilitarios.h"
#ifndef BIDIMENSIONALES_H
#define BIDIMENSIONALES_H
#define PI 3.1415

//1AREA DEL CIRCULO - Alex
float circulo_area(){
    float radio_cir, superficie;
    radio_cir = validacion("Ingrese el radio en Cm \n");
    superficie = PI * (radio_cir*radio_cir);
    printf("La superficie del circulo es %.2f Cm cuadrados", superficie);
    return superficie;
}
//2AREA DEL CUADRADO - Alex
float cuadrado_area(){
    float lado_cua, superficie;
    lado_cua = validacion("Ingrese el valor de un lado del cuadrado \n");
    superficie = (lado_cua*lado_cua);
    printf("La superficie del cuadrado es %.2f m cuadrados", superficie);
    return superficie;
}
//3AREA DEL DECAGONO - Alex
float decagono_area(){
    float lado_deca, superficie;
    lado_deca = validacion("Ingrese el valor de un lado del decagono \n");
    superficie = (5/2) * (lado_deca*lado_deca) * cot(PI/10);
    printf("La superficie del decagono es %.2f m cuadrados", superficie);
    return superficie;
}
//4AREA DEL DODECAGONO - Alex
float dodecagono_area(){
    float lado_dode, superficie;
    lado_dode = validacion("Ingrese el valor de un lado del dodecagono \n");
    superficie =3 * (lado_dode) * cot(PI/12);
    printf("La superficie del dodecagono es %.2f m cuadrados", superficie);
    return superficie;
}
//5AREA DEL ELIPSE - Alex
float elipse_area(){
    float semi_mayor,semi_menor, superficie;
    semi_mayor = validacion("Ingrese el valor del semieje mayor en metros \n");
    semi_menor = validacion("Ingrese el valor del semieje menor en metros \n");
    superficie =PI * semi_mayor * semi_menor;
    printf("La superficie de la elipse es %.2f m cuadrados", superficie);
    return superficie;
}
//6AREA DEL ENNEAGONO - Alex
float enneagono_area(){
    float lado_enne, superficie;
    lado_enne = validacion("Ingrese el valor de un lado del enneagono en metros \n");
    superficie =(9/4) * (lado_enne) * cot(PI/9);
    printf("La superficie del enneagono es %.2f m cuadrados", superficie);
    return superficie;
}
//7AREA DEL HEPTAGONO - Alex
float heptagono_area(){
    float lado_hep, superficie;
    lado_hep = validacion("Ingrese el valor de un lado del heptagono en metros \n");
    superficie =(7/4) * (lado_hep*lado_hep) * cot(PI/7);
    printf("La superficie del heptagono es %.2f m cuadrados", superficie);
    return superficie;
}
//8AREA DEL HEXAGONO - Alex
float hexagono_area(){
    float lado_hexa, superficie;
    lado_hexa = validacion("Ingrese el valor de un lado del hexagono en metros \n");
    superficie =(3 sqrt(3/2)) * (lado_hexa*lado_hexa);
    printf("La superficie del hexagono es %.2f m cuadrados", superficie);
    return superficie;
}
//9AREA DEL OCTAGONO - Alex
float octagono_area(){
    float lado_octa, superficie;
    lado_octa = validacion("Ingrese el valor de un lado del octagono en metros \n");
    superficie =2 * (1 + sqrt (2)) * (lado_octa*lado_octa);
    printf("La superficie del octagono es %.2f m cuadrados", superficie);
    return superficie;
}
//10AREA DEL PENTAGONO - Alex
float pentagono_area(){
    float lado_penta, superficie;
    lado_penta = validacion("Ingrese el valor de un lado del pentagono en metros \n");
    superficie =(1/4) * sqrt(5(5 + 2 sqrt (5)))*(lado_penta*lado_penta);
    printf("La superficie del pentagono es %.2f m cuadrados", superficie);
    return superficie;
}
#endif