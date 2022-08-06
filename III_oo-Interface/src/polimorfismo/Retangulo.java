package polimorfismo;

public class Retangulo implements Figura{
	private double base;
	private double altura;

	Retangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area(){
			double area = this.base * this.altura;
		return area;
	}
}
