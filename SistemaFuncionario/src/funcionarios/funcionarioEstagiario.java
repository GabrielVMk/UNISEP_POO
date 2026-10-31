package funcionarios;

public class funcionarioEstagiario extends funcionario {

	public funcionarioEstagiario(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * 0.05 );
		
	}

}
