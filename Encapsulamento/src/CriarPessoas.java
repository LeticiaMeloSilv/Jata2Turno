
public class CriarPessoas {

	public static void main(String[] args) {
		pessoa p1=new pessoa();
		p1.setNome("Mona");
		p1.setAltura(1.60);
		p1.setPeso(50);
		p1.setCorDosOlhos("verde");
		
		System.out.println("Nome: " + p1.getNome() + "\nAltura: "+p1.getAltura()+"\nPeso: "+p1.getPeso()+"\nCor dos olhos: "+p1.getCorDosOlhos());
	}

}
