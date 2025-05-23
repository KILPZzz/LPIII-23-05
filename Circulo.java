
public class Circulo extends Figura{

	private double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		double area = Math.PI*(raio*raio);
		return area;
	}



	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		double perimetro = 2*Math.PI*raio;
		return perimetro;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", cor=" + getCor() + "]";
	}
	
	
	
}
