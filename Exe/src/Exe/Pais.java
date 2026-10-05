package Exe;

public class Pais {
	
	//Atributos
	private String codigo;
	private String nome;
	private int populacao;
	private Double dimensao;
	
	//construtor é a primeira função a ser executada numa função
	Pais(String codigo, String nome, Double dimensao){
		this.codigo = "BRA";
		this.nome = "Brasil";
		this.dimensao = 8515767.046;
		
	}
	
	//matodos
	public void listaPais() {
		System.out.println("código: " + this.codigo);
		System.out.println("nome: " + this.nome);
		System.out.println("população: " + this.populacao);
		System.out.println("Dimensão: " + this.dimensao);
		System.out.println(" ");}
		
		public String getNome() {
			return this.nome;
		}
		
		public void setNome() {
		this.nome = nome;
	}
	
		public int getPpulacao() {
			return this.populacao;
		}
		
		public void setPopulacao() {
			this.populacao = populacao;
			
		}
		
	

}
