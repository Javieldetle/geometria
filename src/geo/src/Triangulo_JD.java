package geo.src;


public class Triangulo_JD extends FiguraGeometrica_JD {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo_JD(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her—ns
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
