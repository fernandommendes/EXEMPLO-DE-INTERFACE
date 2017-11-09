package dados;

public class Quadrado extends FormaGeometrica implements Bidimensional {

	private double lado;
	
	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2);
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return FormaGeometrica.BIDIMENSIONAL;
	}
	
	public String toString() {
		return
				"Quadrado de lado: " + lado + "\n" +
				"Area: " + getArea() + "\n";
	}

}
