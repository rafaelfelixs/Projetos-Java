
public class ShapeMake {
	private Shape circulo;
	private Shape retangulo;
	private Shape quadrado;
	
	public ShapeMake() {
		circulo = new Circulo ();
		System.out.println("O Circulo foi criado");
		retangulo = new Retangulo();
		System.out.println("O Retangulo foi criado");
		quadrado = new Quadrado();
		System.out.println("O Quadrado foi criado");
	}
	
	public void drawCircle () {
		circulo.desenhar();
	}
	
	public void drawRetangulo () {
		retangulo.desenhar();
	}
	
	public void drawQuadrado () {
		quadrado.desenhar();
	}
	

}
