


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import utiles.Utiles;


/**
 *
 * @author JAIMEUNL
 */

public class F_Soledad {
    
    public static float ejecutarOctaedroArea(float a)  { // a = arista 
        return Utiles.redondear((float)(2 * Math.sqrt(3) * Math.pow(a, 2)));//1
    }
    public static float ejecutarOctaedroVolumen(float a)  { // a = longitud
        return Utiles.redondear((float)((Math.sqrt(2) / 3) * Math.pow(a, 3)));//2
    }
    public static float ejecutarOrtoedro(float l, float w, float h) { // 3
        return Utiles.redondear((2 * l * w) + (2 * l * h) + (2 * w * h)); // l = longitud  - w = ancho- h = altua
    }

    public static float ejecutarParalelepipedo(float a, float b, float c) { // a = lado - b = lado - c = lado
        return Utiles.redondear(2 * ((a * b) + (a * c) + (b * c)));  // 4
    }


    public static float ejecutarPiramideCuadrada(float a, float h) { // a = base - h = altura
        return Utiles.redondear((float) (Math.pow(a, 2) + (2 * a) * Math.sqrt((Math.pow(a, 2) / 4) + Math.pow(h, 2)))); // 5
    }
    public static float areaBaseDodecagonal(float a) { // a longitud de un lado
        return Utiles.redondear((float) (3 * (2 + Math.sqrt(3)) * Math.pow(a, 2)));
    }
    // calcular el volumen de la pirámide dodecagonal
    public static float ejecutarVolumenDodecagonal(float l, float a) {// l = area base , a = atura 
        float b = areaBaseDodecagonal(l);
        return Utiles.redondear((float) ((1.0 / 3.0) * b * a));// 6
    }
    public static float ejecutarPiramideHexagonal(float l, float a_base, float a_lateral) { // l = lado de la base - a_base = area base - a_lateral
        return Utiles.redondear((3 * l) * (a_base + a_lateral)); // 7
    }

    public static float ejecutarPiramideOblicua(float l, float a) { // l = lado base - a = altura
        // Área de la base (cuadrada)
        float areaBase = l * l;
        // Área lateral 
        float apotema = (float) Math.sqrt((l / 2) * (l / 2) + a* a); 
        float areaLateral = 4 * (0.5f * l * apotema); 
        // Área total
        return Utiles.redondear(areaBase + areaLateral); // 8
    }

    public static float ejecutarPiramidePentagonal(float l, float al) { // l = lado base - al = altura lateral 
        // perímetro de la base
        float perimetroBase = 5 * l;
        // apotema 
        float apotemaBase = 0.5f * (float) Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * l; // Apotema
        // Área de la base
        float areaBase = (perimetroBase * apotemaBase) / 2;
        // Área lateral
        float areaLateral = (5 * l * al) / 2;
        // Área total
        return Utiles.redondear(areaBase + areaLateral);// 9
    }
    public static float ejecutarPiramideTriangular(float b, float a, float al) { // b = baseTriangulo a = alturaTriangulo al = altura lateral 
        // área de la base 
        float areaBase = (b * a) / 2;
        //  área lateral
        float areaLateral = 3 * (0.5f * b * al);
        // Área total
        return Utiles.redondear(areaBase + areaLateral);// 10
    }
    public static float ejecutarPiramideTruncada(float lm, float ln, float al) { // lm = ladoBaseMayor ln = ladoBaseMenor al = alturaLateral
        float perimetroBaseMayor = 4 * lm;
        float perimetroBaseMenor = 4 * ln;
        // Área lateral 
        float areaLateral = ((perimetroBaseMayor + perimetroBaseMenor) / 2) * al;
        return Utiles.redondear((lm * lm ) + (ln * ln) + areaLateral); // 11
    }
    // area de la base 
    public static float ejecutarBaseDodecagonal(float l) { // l = lado
        return Utiles.redondear((float) (3 * (2 + Math.sqrt(3)) * Math.pow(l, 2)));
    }
    public static float ejecutarPrismaDodecagonal(float l, float a) { // l = lado , a = altura
        float areaBase = ejecutarBaseDodecagonal(l);
        return Utiles.redondear(areaBase + ((12 * l) * a)); // 12
    }
  
// area de la base
    public static float ejecutarBaseHexagonal(float l) { // l = lado
        return (float) ((3 * Math.sqrt(3) / 2) * Math.pow(l, 2));
    }
    public static float ejecutarPrismaHexagonal(float l, float a) { // l = lado a = altura
        float areaBase = ejecutarBaseHexagonal(l);
        return Utiles.redondear(2 * areaBase + ((6 * l) * a)); // 13
    }

    public static float ejecutarBasePentagonal(float l, float a) {// l = lado a = apotema
        return Utiles.redondear((5 / 2.0f) * a * l);
    }
    public static float ejecutarPrismaPentagonal(float l ,float a, float al) { // l = lado a = apotema al = altura
        float areaBase = ejecutarBasePentagonal(l, a);
        return Utiles.redondear(2 * areaBase + ((5 * l) * al)); // 14
    }
 
    public static float ejecutarPrismaRectangular(float l, float a, float h) { // l = longitud- a = ancho h =altura
        return Utiles.redondear(2 * (l* a + l * h + a * h)); // 15
    }
    // área de la base 
    public static float ejecutarBaseTriangular(float b, float a) { // b = base a = altura
        return 0.5f * b * a;
    }
    public static float areaSuperficialPrismaTriangular(float a, float b, float c, float at, float ag) {
        // a = ladoA, b = ladoB, c = ladoC ; at = altura prisma  ag = altura triangulo
        float areaBase = ejecutarBaseTriangular(b, ag); 
        return Utiles.redondear(2 * areaBase + ((a + b + c) * at)); // Área total // 16
    }
    public static float ejecutarSemiEsfera(float a) { // a = radio
        return Utiles.redondear((float) ((2) * (Math.PI) * (Math.pow(a, 2)))); // 17

    }
    public static float ejecutarTetraedroArea(float a) { // a = arista 
        return Utiles.redondear((float) (Math.sqrt(3) * (Math.pow(a, 2)))); // 18
    }
    public static float ejecutarTetraedroVolumen(float a) { // a = arista 
        return Utiles.redondear((float) ((Math.pow(a, 3) * (Math.sqrt(2))) / 12)); //19
    }
}