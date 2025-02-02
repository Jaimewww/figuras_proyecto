package controller;

import utiles.Utiles;

/**
 *
 * @author JAIMEUNL
 */
public class F_Alex {

    // Paralelogramo Alex_Sigcho
    public static Float paralelogramo(Float base, Float altura) {
        // Paralelogramo Alex_Sigcho 1
        Float area = base * altura;
        return Utiles.redondear(area);
    }

    // Pentágono Alex_Sigcho
    public static  Float pentagono(Float lado, Float apotema) {
        Float area = ((5 * lado) * apotema) / 2;
        return Utiles.redondear(area);
    }
    // Polígono regular Alex_Sigcho
    public static  Float poligonoRegular(Float perimetro, Float apotema) {    
        Float area = (perimetro * apotema) / 2;
        return Utiles.redondear(area);
    }

    // Rectángulo Alex_Sigcho
    public static Float rectangulo(Float largo, Float ancho) {
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }

    // Rombo Alex_Sigcho
    public static Float rombo(Float diagonalMayor, Float diagonalMenor) {
        Float area = (diagonalMayor * diagonalMenor) / 2;
        return Utiles.redondear(area);
    }

    // Romboide Alex_Sigcho
    public static Float romboide(Float base, Float altura) {
        Float area = base * altura;
        return Utiles.redondear(area);
    }

    // Sector circular Alex_Sigcho
    public static  Float sectorCircular(Float angulo, Float radio) {
        Float area = (float) ((angulo / 360) * (Math.PI * (radio * radio)));
        return Utiles.redondear(area);
    }

    // Segmento circular Alex_Sigcho
    public static Float segmentoCircular(Float angulo, Float radio) {
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) (Math.pow(0.5, radio) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

    // Segmento elíptico Alex_Sigcho
    public static Float segmentoEliptico(Float semiejeMayor, Float angulo, Float semiejeMenor) {
        Float anguloRad = (float) Math.toRadians(angulo);
        Float area = (float) ((0.5 * (semiejeMayor * semiejeMenor)) * (anguloRad - Math.sin(anguloRad)));
        return Utiles.redondear(area);
    }

    // Semicírculo Alex_Sigcho
    public static Float semicirculo(Float radio) {
        Float area = (float) (((Math.PI) * (Math.pow(radio, 2))) / 2);
        return Utiles.redondear(area);
    }

    // Trapecio circular Alex_Sigcho
    public static Float trapecioCircular(Float radioExterior, Float radioInterior, Float radio) {
        Float area = (float) ((0.5) * (radio) * ((Math.pow(radioExterior, 2)) - (Math.pow(radioInterior, 2))));
        return Utiles.redondear(area);
    }

    // Trapecio isósceles Alex_Sigcho
    public static Float trapecioIsosceles(Float baseMayor, Float baseMenor, Float altura) {
        Float area = ((baseMayor * baseMenor) / 2) * altura;
        return Utiles.redondear(area);
    }

    // Triángulo Alex_Sigcho
    public static Float triangulo(Float base, Float altura) {
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

    // Triángulo equilátero Alex_Sigcho
    public static Float trianguloEquilatero(Float lado) {
        Float area = (float) ((Math.pow(lado, 2)) / 4);
        return Utiles.redondear(area);
    }
    
    // Triángulo escaleno Alex_Sigcho
    public static Float trianguloEscaleno(Float base, Float altura) {
        Float area = (base * altura) / 2;
        return Utiles.redondear(area);
    }

    // Triqueta Alex_Sigcho
    public static Float triqueta(Float largo, Float ancho) {
        Float area = largo * ancho;
        return Utiles.redondear(area);
    }

    // Alex Sigcho - corazon - área - 16
    public static Float corazon(float escala) {
        int n = 10000;
        Float area = 0.0f;
        Float deltaT = 2 * (float) Math.PI / n;

        for (int i = 0; i < n; i++) {
            float t = i * deltaT;

            Float x = 16 * (float) Math.pow(Math.sin(t), 3);
            Float y = 13 * (float) Math.cos(t) - 5 * (float) Math.cos(2 * t)
                    - 2 * (float) Math.cos(3 * t) - (float) Math.cos(4 * t);

            float tNext = (i + 1) * deltaT;
            Float xNext = 16 * (float) Math.pow(Math.sin(tNext), 3);
            Float yNext = 13 * (float) Math.cos(tNext) - 5 * (float) Math.cos(2 * tNext)
                    - 2 * (float) Math.cos(3 * tNext) - (float) Math.cos(4 * tNext);
            area += (x * (yNext - y) - y * (xNext - x));
        }

        area = Math.abs(area * 0.5f);
        area *= escala;          

        return Utiles.redondear(area); 
    }

}
