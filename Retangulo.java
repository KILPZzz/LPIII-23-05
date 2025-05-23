
public class Retangulo extends Figura{

	private double base;
	private double altura;

	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		double area = base * altura;
		return area;
	}



	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		double perimetro = (2*base)+(2*altura);
		return perimetro;
	}



	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



@Override
public String toString() {
    return "Retangulo [base=" + base + ", altura=" + altura + ", cor=" + getCor() + "]";
}

}
