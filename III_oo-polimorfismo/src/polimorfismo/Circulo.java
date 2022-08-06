package polimorfismo;

public class Circulo extends Figura{
	private double raio;
	private double pi = 3.14;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	public double area () {
		double area = pi * this.raio *this.raio;
	return area;	
	}

}
