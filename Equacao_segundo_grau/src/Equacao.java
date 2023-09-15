
public class Equacao {
	private double a;
	private double b;
	private double c;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public double calcularDelta() {
		return (b * b)-4*a*c;
	}
	public double x1() {
		return (-b+(calcularDelta()/calcularDelta()))/(2*a);
	}
	public double x2() {
		return (-b-(calcularDelta()/calcularDelta()))/(2*a);
	}

}
