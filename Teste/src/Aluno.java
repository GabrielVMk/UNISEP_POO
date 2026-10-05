
public class Aluno {
	//Atributos 
	String nome;
	String ra;
	float valor_mensalidade;
	
	//construtores
//	public Aluno() {
//	this.nome = "NÃO DECLARADO";
//	this.ra = "NÃO DECLARADO";
//	this.valor_mensalidade =  0;
//	}
	
	public Aluno(String nome, String ra, float valor_mensalidade) {
		this.nome = nome;
		this.ra = ra;
		this.valor_mensalidade = valor_mensalidade;
		
	}
	
	
	//metodos 
	public void imprime_aluno() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Nome so aluno: " + this.nome);
		System.out.println("RA do aluno: " + this.ra);
		System.out.println("Valor da mensalidade: " + this.valor_mensalidade);
		System.out.println("***************************");
	}

}
