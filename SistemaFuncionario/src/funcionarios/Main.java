package funcionarios;


public class Main {

	public static void main(String[] args) {
		
		funcionario f1 = new funcionarioCLT ("Renato", 1621.00);
		funcionario f2 = new FuncionarioPJ("Armarindo", 1621.00);
        funcionario f3 = new funcionarioEstagiario("Pessanha", 1621.00);
        
        //funcionario CLT
        
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario Base: R$ " + f1.getSalarioBase());
        System.out.println("Salario Final: R$ " + f1.calcularSalario());
        
        System.out.println("-----------------------------------");
        
        //funcionario PJ
        
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salario Base: R$ " + f2.getSalarioBase());
        System.out.println("Salario Final: R$ " + f2.calcularSalario());
        	
        System.out.println("-----------------------------------");
        
        //funcionario estagiario
        
        System.out.println("Nome: " + f3.getNome());
        System.out.println("Salario Base: R$ " + f3.getSalarioBase());
        System.out.println("Salario Final: R$ " + f3.calcularSalario());

        System.out.println("-----------------------------------");
	}
}