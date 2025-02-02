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
public class F_Jaime{
    //Bipiramide Cuadrada
    public static float ejecutarBipiramideCuadrada(float b, float l){
        //b: Longitud de un lado de la base cuadrada.
        //l: Altura inclinada (apotema) de una cara triangular.
        return Utiles.redondear(4 * b * l);
    }
    
    //Octagono regular con apotema - Jaime
    public static float ejecutarOctagonoRegular(float s, float a) {
        return Utiles.redondear(((7 * a) * s) / 2);
    }
    
    //Ortoedro - Jaime
    public static float ejecutarOrtoedro(float l, float w, float h) {
        //l : ("Ingrese la longitud: ");
        //w : ("Ingrese el ancho: ");
        //h : ("Ingrese la altura: ");
        return Utiles.redondear((2 * l * w) + (2 * l * h) + (2 * w * h));
    }

    //Paralelepipedo - jaime
    public static float ejecutarParalelepipedo(float a, float b, float c) {
        //a : ("Ingrese el valor del lado a: ");
        //b : ("Ingrese el valor del lado b: ");
        //c : ("Ingrese el valor del lado c: ");
        return Utiles.redondear(2 * ((a * b) + (a * c) + (b * c)));
    }

    //Paralelogramo - Jaime
    public static float ejecutarParalelogramo(float b, float h) {
        //b : ("Ingrese el valor del la base: ");
        //h : ("Ingrese el valor de la altura: ");
        return Utiles.redondear(b * h);
    }

    //Pentagono - Jaime
    public static float ejecutarPentagono(float l, float ap) {
        //l : ("Ingrese el valor de un lado");
        //ap : ("Ingrese el valor del apotema: ");
        return Utiles.redondear(((5 * l) * ap) / 2);
    }

    //Piramide cuadrada - Jaime
    public static float ejecutarPiramideCuadrada(float a, float h) {
        //a : ("Ingrese el lado de la base: ");
        //h : ("Ingrese la altura: ");
        return Utiles.redondear((float) (Math.pow(a, 2) + (2 * a) * Math.sqrt((Math.pow(a, 2) / 4) + Math.pow(h, 2))));
    }

    //Piramide dodecagonal - Jaime
    public static float ejecutarPiramideDodecagonal(float l, float apotema) {
        //l : ("Ingrese el valor de un lado de la base: ");
        float p = l * 12;
        //apotema : ("Ingrese el valor del apotema: ");
        return Utiles.redondear(2 * ((p * apotema) / 2));
    }

    //Piramide hexagonal
    public static float ejecutarPiramideHexagonal(float l, float a_base, float a_lateral, float area) {
        //l : ("Ingrese el valor de un lado de la base: ");
        //a_base : ("Ingrese el area de la base: ");
        //a_lateral : ("Ingrese el area lateral: ");
        return Utiles.redondear((3 * l) * (a_base + a_lateral));
    }
    
    //  calcular el área de la base dodecagonal
    public static float areaBaseDodecagonal(float a) {
        return Utiles.redondear((float) (3 * (2 + Math.sqrt(3)) * Math.pow(a, 2)));
    }

    // calcular el volumen de la pirámide dodecagonal
    public static float calcularVolumenPiramiPentag(float l, float a) {
        float b = areaBaseDodecagonal(l);
        return Utiles.redondear((float) ((1.0 / 3.0) * b * a));
    }
    
    public static float ejecutarCono(float r, float a) { // r = radio , a = altura
        return Utiles.redondear((float)(Math.PI * r * (r + (Math.sqrt(r * r + a * a)))));
    }

    public static float ejecutarConoOblicuo(float r, float g) { // r = radio , g = longitud de la generatriz
        return Utiles.redondear((float)(Math.PI * r * (r + g)));
    }

    public static float ejecutarCubo(float l) { // l = lado
        return Utiles.redondear(6 * (float) Math.pow(l, 2));
    }

    public static float ejecutarCuboctaedro(float l) { // l = lado
        return Utiles.redondear((float)(2 * (5 + Math.sqrt(3)) * Math.pow(l, 2)));
    }

    public static float ejecutarAreaDodecaedro(float a) { //a = arista 
        return Utiles.redondear((float)(3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2)));
    }

    public static float ejecutarVolumenDodecaedro(float a) { //a = arista 
        return Utiles.redondear((float)(((15 + 7 * Math.sqrt(5)) * Math.pow(a, 3)) / 4));
    }

    public static float ejecutarElipsoide(float l, float h, float a) { // l = largo de un lado , h = altura , a = ancho
        return Utiles.redondear((float)((4 * Math.PI / 3) * l * a * h));
    }

    public static float ejecutarEsferahueca(float r, float R) { // r = radio Interno de la esfera, R Externo de la esfera
        return Utiles.redondear((float)((4 / 3) * Math.PI * ((Math.pow(R, 3)) - (Math.pow(r, 3)))));
    }

    public static float ejecutarEsferaInclinada(float r, float h) { // r = esfera inclinada , h = altura esfera inclinada
        return Utiles.redondear((float)((Math.PI * Math.pow(h, 2) * (3 * r - h)) / 3));
    }

    public static float ejecutarEsferoideOblato(float e, float p) { // e = radio ecuatorial del esferoide oblato, p = radio polar del esferoide oblato
        return Utiles.redondear((float)((4 / 3) * Math.PI * Math.pow(e, 2) * p));
    }

    public static float ejecutarHemisfera(float r) { // r = radio
        return Utiles.redondear((float) (3 * Math.PI * Math.pow(r, 2)));
    }

    public static float ejecutarAreaIcosaedro(float a) { // a = arista
        return (float) (5 * Math.sqrt(3) * Math.pow(a, 2));
    }

    public static float ejecutarVolumenIcosaedro(float a) { // a = arista
        return Utiles.redondear((float) ((5 * (3 + Math.sqrt(5)) / 12) * Math.pow(a, 3)));
    }
    
    //Casquete esferico - Jaime
    public static float ejecutarCasqueteEsferico(float R, float h) {
        return Utiles.redondear(2 * (float) Math.PI * R * h);
    }
    
    //Cilindro Area - Jaime
    public static float ejecutarCilindro(float r, float h){
        //r : Radio de la base
        //h : Altura del cilindro
        return Utiles.redondear((float)((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2))));
    }
    
    //Cilindro elíptico - Jaime
    public static float ejecutarCilindroEliptico(float a, float b, float h){
        //a : Semieje Mayor
        //b : Semieje Menor
        //h : altura del cilindro
        return Utiles.redondear((float)((2 * Math.PI * a * b) + (2 * Math.PI * b * h)));
    }
    
    //Cilindro Hueco - Jaime
    public static float ejecutarCilindroHueco(float R, float r, float h){
        //R : Radio exterior
        //r : Radio interior
        //h : Altura
        return 
    }
}
