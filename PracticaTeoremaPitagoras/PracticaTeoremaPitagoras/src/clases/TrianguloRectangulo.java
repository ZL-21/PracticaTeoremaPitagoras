package clases;

public class TrianguloRectangulo {
	int a;
	int b;
	/**
	 * Recibe los valores de los catetos
	 * @param  Recibe el valor del cateto a
	 * @param  Recibe el valor del cateto b
	 * @throws IllegalArgumentException Controla que los catetos no sean 0 o menos
	 */

	public TrianguloRectangulo(int a, int b) throws IllegalArgumentException {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Los catetos no pueden ser negativos");
		}
		this.a = a;
		this.b = b;
	}
	/**
	 * Crea un TrianguloRectangulo con los valores indicado
	 */

	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	/**
	 * Funcion que calcula y devuelve el area del TrianguloRectangulo
	 * @return El area 
	 */

	public double area() {
		double area = (a * b) / 2.0;
		return area;
	}
	/**
	 * Funcion para calcular la hipotenusa
	 * @return La hipotenusa
	 */
	
	public double hipotenusa () {
		double hipotenusa = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		return hipotenusa;
	}
	/**
	 * Funcion que calcula el perimetro del TrianguloRectangulo
	 * @return El perimetro
	 */
	
	public double perimetro () {
		double perimetro = a + b + hipotenusa();
		return perimetro;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public String toString() {
		return "El cateto a es " + this.a + " ,el b es "+this.b;
	}
	
}
