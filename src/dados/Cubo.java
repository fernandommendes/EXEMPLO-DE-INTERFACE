package dados;

public class Cubo extends FormaGeometrica implements Tridimensional {

	private double lado;
	
	
	public Cubo(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 2) * 6;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 3);
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return
				"Cubo de lado: " + lado + "\n" +
				"Area: " + getArea() + "\n" +
				"Volume: " + getVolume() + "\n";
	}

}
