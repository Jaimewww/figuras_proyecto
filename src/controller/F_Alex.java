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
public class F_Alex {

    // Paralelogramo Alex_Sigcho 1
    public static float paralelogramo(float base, float altura) {
        Float area = base * altura;
        return Utiles.redondear(area);
    }

    // Pentágono Alex_Sigcho 2
    public static float pentagono(float lado, float apotema) {
        Float area = ((5 * lado) * apotema) / 2;
        return Utiles.redondear(area);
    }

    // Polígono regular Alex_Sigcho 3
    public static float poligonoRegular(float perimetro, float apotema) {
        Float area = (perimetro * apotema) / 2;
        return Utiles.redondear(area);
    }

    // Rectángulo Alex_Sigcho 4
    public static float rectangulo(float largo, float ancho) {
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }

    // Rombo Alex_Sigcho5
    public static float rombo(float diagonalMayor, float diagonalMenor) {
        Float area = (diagonalMayor * diagonalMenor) / 2;
        return Utiles.redondear(area);
    }

    // Romboide Alex_Sigcho6
    public static float romboide(float base, float altura) {
        Float area = base * altura;
        return Utiles.redondear(area);
    }

    // Sector circular Alex_Sigcho7
    public static float sectorCircular(float angulo, float radio) {
        Float area = (float) ((angulo / 360) * (Math.PI * (radio * radio)));
        return Utiles.redondear(area);
    }

    // Segmento circular Alex_Sigcho8
    public static float segmentoCircular(float angulo, float radio) {
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) (Math.pow(0.5, radio) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

    // Segmento elíptico Alex_Sigcho9
    public static float segmentoEliptico(float semiejeMayor, float angulo, float semiejeMenor) {
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) ((0.5 * (semiejeMayor * semiejeMenor)) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

    // Semicírculo Alex_Sigcho10
    public static float semicirculo(float radio) {
        Float area = (float) (((Math.PI) * (Math.pow(radio, 2))) / 2);
        return Utiles.redondear(area);
    }

    // Trapecio circular Alex_Sigcho11
    public static float trapecioCircular(float radioExterior, float radioInterior, float radio) {
        Float area = (float) ((0.5) * (radio) * ((Math.pow(radioExterior, 2)) - (Math.pow(radioInterior, 2))));
        return Utiles.redondear(area);
    }

    // Trapecio isósceles Alex_Sigcho12
    public static float trapecioIsosceles(float baseMayor, float baseMenor, float altura) {
        Float area = ((baseMayor * baseMenor) / 2) * altura;
        return Utiles.redondear(area);
    }

    // Triángulo Alex_Sigcho13
    public static float triangulo(float base, float altura) {
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

    // Triángulo equilátero Alex_Sigcho14
    public static float trianguloEquilatero(float lado) {
        Float area = (float) ((Math.pow(lado, 2)) / 4);
        return Utiles.redondear(area);
    }

    // Triángulo escaleno Alex_Sigcho15
    public static float trianguloEscaleno(float base, float altura) {
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

    // Triqueta Alex_Sigcho16
    public static float triqueta(float largo, float ancho) {
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }
}
