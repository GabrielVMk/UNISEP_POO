package heranca;

//Classe base
public class Animal {
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void fazerBarulho() {
		System.out.println("O " + nome + " faz um barulho.");
	}
	
	public void info() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}
}

//Subclasse: herdara da Animal
class Cachorro extends Animal {
	private String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade); //chamara o construtor da superclasse
		this.raca = raca;
		
	}
	
	public void fazerBrarulho() {
		System.out.println(nome + "(cachorro): Au Au!");
	}
	
	public void info() {
		super.info(); //Ira reutilizar o metodo da classe base
		System.out.println("Raça: " + raca);
	}
}

//subclasse: herda de Animal
class Gato extends Animal{
	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	public void fazerBarulho() {
		System.out.println(nome + " (gato): Miau!");
	}
}

