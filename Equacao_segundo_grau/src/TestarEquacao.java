
public class TestarEquacao {

	public static void main(String[] args) {
		Equacao eq = new Equacao();
		eq.setA(3.0);
		eq.setB(2.0);
		eq.setC(8.0);
		System.out.println(eq.calcularDelta());
		System.out.println("x1= " + eq.x1()+ "\nx2= "+ eq.x2());
	}

}
