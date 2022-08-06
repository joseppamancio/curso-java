package polimorfismo;

public class Retangulo extends Figura{
	private double base;
	private double altura;

	Retangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double area(){
			double area = this.base * this.altura;
		return area;
	}
}
