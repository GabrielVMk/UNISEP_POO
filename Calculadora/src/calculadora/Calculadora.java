package calculadora;

//Atividade sobre herança.

public class Calculadora {
	double valor1 = 0;
	double valor2 = 0;
	
	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public void soma() {
		System.out.println("Executar operação Soma");
	}
	
	public void subtração() {
		System.out.println("Executar operação Subtração");
	}
	
	public void multiplicação() {
		System.out.println("Executar operação Multiplicação");
	}
	
	public void divisão() {
		System.out.println("Executar operação Divisão");
	}
	
	//polimorfismo:é a capacidade de um mesmo método ou objeto ser utilizado de diferentes formas.
}
