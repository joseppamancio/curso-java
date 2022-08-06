package polimorfismo;

public class Circulo implements Figura{
	private double raio;
	private double pi = 3.14;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area () {
		double area = pi * this.raio *this.raio;
	return area;	
	}

}
