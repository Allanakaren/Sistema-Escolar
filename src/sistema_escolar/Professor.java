package sistema_escolar;

public class Professor extends Pessoa{
	
	

	private double salario;
	
	public Professor(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
		
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "INFORMA��ES DE DOCENTES\n" + super.toString() +
				"\nSAL�RIO = R$ " + salario;					
	}

}
