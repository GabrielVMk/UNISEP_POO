package heranca;

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Cachorro("Jeba", 3, "Labrador");
		Animal a2 = new Gato("Mika", 2);
		
		// Polimorfismo: referência do tipo Animal, objeto concreto
		a1.fazerBarulho(); //Au au
		a2.fazerBarulho(); // Miau
		
		((Cachorro) a1).info(); //Nome, Idade e raça
				
	}

}
