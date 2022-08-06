package polimorfismo;

public class Triangulo implements Figura{
	private double base;
	private double altura;
	
	Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area(){
		double area = (this.base * this.altura)/2;
		return area;
	}
}
