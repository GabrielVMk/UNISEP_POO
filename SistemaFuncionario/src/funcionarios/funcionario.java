package funcionarios;

public class funcionario {
	public String nome;
	protected double salarioBase;
	
	public funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		return salarioBase;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public double publicarSalario() {
		return 0;
	}
}

