package polimorfismo;

public class Teste {
	public static void main(String[] args) {
		 Circulo circulo = new Circulo(10);
		 Retangulo retangulo = new Retangulo(2,20);
		 Triangulo triangulo = new Triangulo(2,20);
		 Quadrado quadrado = new Quadrado(10);
		 
		 System.out.println("A área do circulo é: "+circulo.area());
		 System.out.println("A área do retangulo é: "+retangulo.area());
		 System.out.println("A área do triangulo é: "+triangulo.area());
		 System.out.println("A área do quadrado é: "+quadrado.area());
	}
}
