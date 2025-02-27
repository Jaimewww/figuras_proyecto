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
public class F_Emilio {

    // dodecaedro area 17
    public static float Ejecutar_dodecaedro(float a) {
        float area = (float) (3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(a, 2));
        return Utiles.redondear(area);
    }

    // dodecaedro volumne 18
    public static float Ejecutar_dodecaedro_volumen(float a) {
        float area = (float) (((15 + 7 * Math.sqrt(5)) * Math.pow(a, 3)) / 4);
        return Utiles.redondear(area);
    }

    // dodecagono 19
    public static float Ejecutar_dodecagono(float l) {
        float area = (float) (5 * l * (l / (2 * Math.tan(Math.toRadians(18)))));
        return Utiles.redondear(area);
    }

    // elipse 20
    public static float Ejecutar_elipse(float a, float b) {
        float area = (float) (Math.PI * a * b);
        return Utiles.redondear(area);
    }

    // elipsoide 21
    public static float Ejecutar_elipsoide_volumen(float l, float h, float a) {
        float area = (float) (4 * Math.PI / 3) * l * a * h;
        return Utiles.redondear(area);
    }

    // eneagono 22
    public static float Ejecutar_eneagono(float l) {
        double ap = (l / 2) * (Math.sin(Math.toRadians(70)) / Math.sin(Math.toRadians(20)));
        float vol = (float) (9 * ap * l) / 2;
        return Utiles.redondear(vol);
    }

    // esfera hueca 23
    public static float Ejecutar_esfera_hueca_volumen(float r, float R) {
        double volumen = ((double) 4 / 3) * Math.PI * ((Math.pow(R, 3)) - (Math.pow(r, 3)));
        float vol = (float) volumen;
        return Utiles.redondear(vol);
    }

    // esfera inclinada 24
    public static float Ejecutar_esfera_inclinada_volumen(float r, float h) {
        float vol = (float) (Math.PI * Math.pow(h, 2) * (3 * r - h)) / 3;
        return Utiles.redondear(vol);
    }

    //esferoide oblato 25 
    public static float Ejecutar_esferoide_oblato_volumen(float e, float p) {
        double volumen = ((double) 4 / 3) * Math.PI * Math.pow(e, 2) * p;
        float vol = (float) volumen;
        return Utiles.redondear(vol);
    }

    //------------------------------------------------------- Nuevo
    public static float Ejecutar_arco_circular(float r, float an) {
        float area = (float) (Math.pow(r, 2) * an) / 2;
        return Utiles.redondear(area);
    }

    public static float Ejecutar_circulo(float r) {
        float area = (float) (Math.pow(r, 2) * Math.PI);
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Circulo_Concentrico(float r, float R) {
        float area = (float) ((Math.pow(R, 2) - Math.pow(r, 2)) * Math.PI);
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Corona_Circular(float radioMayor, float radioMenor) {
        float area = (float) (Math.PI * (Math.pow(radioMayor, 2) - Math.pow(radioMenor, 2)));
        return Utiles.redondear(area);
    }

    public static float Ejecutar_decagono(float p, float a) {
        float area = (float) (p * a) / 2;
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Estrella5(float r) {
        int puntas = 5;
        float angulo = (float) (4 * Math.PI / puntas);
        float area = (puntas / 2.0f) * r * r * (float) Math.sin(angulo);
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Estrella6(float r) {
        float lado = (float) (Math.sqrt(3) * r / 2);
        float area = (float) (3 * Math.sqrt(3) * Math.pow(lado, 2));
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Heptagono(float r) {
        float angulo = (float) (2 * Math.PI / 7);
        float area = (7 / 2.0f) * r * r * (float) Math.sin(angulo);
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Hexagono(float l) {
        float area = (float) ((3 * Math.sqrt(3) / 2) * Math.pow(l, 2));
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Octagono(float l) {
        float area = 2 * (1 + (float) Math.sqrt(2)) * (float) Math.pow(l, 2);
        return Utiles.redondear(area);
    }

    public static float Ejecutar_Octagono_Apotema(float l, float ap) {
        float perimetro = 8 * l;
        float area = (1 / 2.0f) * perimetro * ap;
        return Utiles.redondear(area);
    }
}
