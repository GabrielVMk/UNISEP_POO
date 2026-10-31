package funcionarios;

public class funcionarioCLT extends funcionario{

	public funcionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
		
	}
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * 0.08 );
		
	}

}
