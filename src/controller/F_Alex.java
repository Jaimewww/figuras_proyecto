/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.text.Utilities;
import utiles.Utiles;

/**
 *
 * @author JAIMEUNL
 */
public class F_Alex {

<<<<<<< HEAD
    // Paralelogramo Alex_Sigcho
    public static Float paralelogramo(Float base, Float altura) {
=======
    // Paralelogramo Alex_Sigcho 1
    public Float paralelogramo(Float base, Float altura) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = base * altura;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Pentágono Alex_Sigcho
    public static  Float pentagono(Float lado, Float apotema) {
=======
    // Pentágono Alex_Sigcho 2
    public Float pentagono(Float lado, Float apotema) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = ((5 * lado) * apotema) / 2;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Polígono regular Alex_Sigcho
    public static  Float poligonoRegular(Float perimetro, Float apotema) {
=======
    // Polígono regular Alex_Sigcho 3
    public Float poligonoRegular(Float perimetro, Float apotema) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (perimetro * apotema) / 2;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Rectángulo Alex_Sigcho
    public static  Float rectangulo(Float largo, Float ancho) {
=======
    // Rectángulo Alex_Sigcho 4
    public Float rectangulo(Float largo, Float ancho) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Rombo Alex_Sigcho
    public static  Float rombo(Float diagonalMayor, Float diagonalMenor) {
=======
    // Rombo Alex_Sigcho5
    public Float rombo(Float diagonalMayor, Float diagonalMenor) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (diagonalMayor * diagonalMenor) / 2;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Romboide Alex_Sigcho
    public static  Float romboide(Float base, Float altura) {
=======
    // Romboide Alex_Sigcho6
    public Float romboide(Float base, Float altura) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = base * altura;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Sector circular Alex_Sigcho
    public static  Float sectorCircular(Float angulo, Float radio) {
=======
    // Sector circular Alex_Sigcho7
    public Float sectorCircular(Float angulo, Float radio) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (float) ((angulo / 360) * (Math.PI * (radio * radio)));
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Segmento circular Alex_Sigcho
    public static  Float segmentoCircular(Float angulo, Float radio) {
=======
    // Segmento circular Alex_Sigcho8
    public Float segmentoCircular(Float angulo, Float radio) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) (Math.pow(0.5, radio) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Segmento elíptico Alex_Sigcho
    public static  Float segmentoEliptico(Float semiejeMayor, Float angulo, Float semiejeMenor) {
=======
    // Segmento elíptico Alex_Sigcho9
    public Float segmentoEliptico(Float semiejeMayor, Float angulo, Float semiejeMenor) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) ((0.5 * (semiejeMayor * semiejeMenor)) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Semicírculo Alex_Sigcho
    public static Float semicirculo(Float radio) {
=======
    // Semicírculo Alex_Sigcho10
    public Float semicirculo(Float radio) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (float) (((Math.PI) * (Math.pow(radio, 2))) / 2);
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Trapecio circular Alex_Sigcho
    public static Float trapecioCircular(Float radioExterior, Float radioInterior, Float radio) {
=======
    // Trapecio circular Alex_Sigcho11
    public Float trapecioCircular(Float radioExterior, Float radioInterior, Float radio) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (float) ((0.5) * (radio) * ((Math.pow(radioExterior, 2)) - (Math.pow(radioInterior, 2))));
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Trapecio isósceles Alex_Sigcho
    public static Float trapecioIsosceles(Float baseMayor, Float baseMenor, Float altura) {
=======
    // Trapecio isósceles Alex_Sigcho12
    public Float trapecioIsosceles(Float baseMayor, Float baseMenor, Float altura) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = ((baseMayor * baseMenor) / 2) * altura;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Triángulo Alex_Sigcho
    public static Float triangulo(Float base, Float altura) {
=======
    // Triángulo Alex_Sigcho13
    public Float triangulo(Float base, Float altura) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Triángulo equilátero Alex_Sigcho
    public static Float trianguloEquilatero(Float lado) {
=======
    // Triángulo equilátero Alex_Sigcho14
    public Float trianguloEquilatero(Float lado) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (float) ((Math.pow(lado, 2)) / 4);
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Triángulo escaleno Alex_Sigcho
    public static Float trianguloEscaleno(Float base, Float altura) {
=======
    // Triángulo escaleno Alex_Sigcho15
    public Float trianguloEscaleno(Float base, Float altura) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

<<<<<<< HEAD
    // Triqueta Alex_Sigcho
    public static Float triqueta(Float largo, Float ancho) {
=======
    // Triqueta Alex_Sigcho16
    public Float triqueta(Float largo, Float ancho) {
>>>>>>> 3f42f4e6c8d93e2135ed6f91a0f88b11539da3aa
        Float area = largo * ancho;
        return Utiles.redondear(area);
   }
    
    // Alex Sigcho - corazon - área - 16
    public static Float corazon(float t) {
        int n = 10000;
        Float area = 0.0f;
        Float deltaT = 2 * (float) Math.PI / n;

        for (int i = 0; i < n; i++) {
            t = i * deltaT;
            Float x = 16 * (float) Math.pow(Math.sin(t), 3);
            Float y = 13 * (float) Math.cos(t) - 5 * (float) Math.cos(2 * t) - 2 * (float) Math.cos(3 * t) - (float) Math.cos(4 * t);
            area += x * y * deltaT;
        }
        area = Math.abs(area);
        return Utiles.redondear(area);
    }
}
