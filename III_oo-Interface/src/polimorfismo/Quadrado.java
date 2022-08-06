package polimorfismo;

public class Quadrado implements Figura{
	private double base;

	Quadrado (double base){
		this.base = base;
	}
	
	@Override
	public double area() {
		double area = this.base * this.base;
		return area;
	}
}
