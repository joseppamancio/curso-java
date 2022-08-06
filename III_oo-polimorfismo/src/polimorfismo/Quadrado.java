package polimorfismo;

public class Quadrado extends Figura{
	private double base;

	Quadrado (double base){
		this.base = base;
	}
	
	public double area() {
		double area = this.base * this.base;
		return area;
	}
}
