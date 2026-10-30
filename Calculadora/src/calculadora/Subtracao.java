package calculadora;

public class Subtracao extends Calculadora{

	public Subtracao(double valor1, double valor2) {
		super(valor1, valor2);
		
	}
	public void subtracao() {
		this.subtracao();
		double resultado = valor1 - valor2;
		
		System.out.println("Resultado da subtração: " + resultado);
	}

}
