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
    public Float paralelogramo(Float base, Float altura) {
        Float area = base * altura;
        return Utiles.redondear(area);
    }

    // Pentágono Alex_Sigcho 2
    public Float pentagono(Float lado, Float apotema) {
        Float area = ((5 * lado) * apotema) / 2;
        return Utiles.redondear(area);
    }

    // Polígono regular Alex_Sigcho 3
    public Float poligonoRegular(Float perimetro, Float apotema) {
        Float area = (perimetro * apotema) / 2;
        return Utiles.redondear(area);
    }

    // Rectángulo Alex_Sigcho 4
    public Float rectangulo(Float largo, Float ancho) {
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }

    // Rombo Alex_Sigcho5
    public Float rombo(Float diagonalMayor, Float diagonalMenor) {
        Float area = (diagonalMayor * diagonalMenor) / 2;
        return Utiles.redondear(area);
    }

    // Romboide Alex_Sigcho6
    public Float romboide(Float base, Float altura) {
        Float area = base * altura;
        return Utiles.redondear(area);
    }

    // Sector circular Alex_Sigcho7
    public Float sectorCircular(Float angulo, Float radio) {
        Float area = (float) ((angulo / 360) * (Math.PI * (radio * radio)));
        return Utiles.redondear(area);
    }

    // Segmento circular Alex_Sigcho8
    public Float segmentoCircular(Float angulo, Float radio) {
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) (Math.pow(0.5, radio) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

    // Segmento elíptico Alex_Sigcho9
    public Float segmentoEliptico(Float semiejeMayor, Float angulo, Float semiejeMenor) {
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) ((0.5 * (semiejeMayor * semiejeMenor)) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

    // Semicírculo Alex_Sigcho10
    public Float semicirculo(Float radio) {
        Float area = (float) (((Math.PI) * (Math.pow(radio, 2))) / 2);
        return Utiles.redondear(area);
    }

    // Trapecio circular Alex_Sigcho11
    public Float trapecioCircular(Float radioExterior, Float radioInterior, Float radio) {
        Float area = (float) ((0.5) * (radio) * ((Math.pow(radioExterior, 2)) - (Math.pow(radioInterior, 2))));
        return Utiles.redondear(area);
    }

    // Trapecio isósceles Alex_Sigcho12
    public Float trapecioIsosceles(Float baseMayor, Float baseMenor, Float altura) {
        Float area = ((baseMayor * baseMenor) / 2) * altura;
        return Utiles.redondear(area);
    }

    // Triángulo Alex_Sigcho13
    public Float triangulo(Float base, Float altura) {
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

    // Triángulo equilátero Alex_Sigcho14
    public Float trianguloEquilatero(Float lado) {
        Float area = (float) ((Math.pow(lado, 2)) / 4);
        return Utiles.redondear(area);
    }

    // Triángulo escaleno Alex_Sigcho15
    public Float trianguloEscaleno(Float base, Float altura) {
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

    // Triqueta Alex_Sigcho16
    public Float triqueta(Float largo, Float ancho) {
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }
}
