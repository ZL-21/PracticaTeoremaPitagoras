package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo triangulo1 = new TrianguloRectangulo (2,4);
		TrianguloRectangulo triangulo2 = new TrianguloRectangulo ();
		
		
		double area1 = triangulo1.area();
        double perimetro1 = triangulo1.perimetro();

        double area2 = triangulo2.area();
        double perimetro2 = triangulo2.perimetro();
        

	}

}
