package funcionarios;

public class FuncionarioPJ extends funcionario{

	public FuncionarioPJ(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	@Override
	public double calcularSalario() {
		return salarioBase + (salarioBase * 0.15 );
		
	}

}
