
public class Main2 {

	public static void main(String[] args) {
		
		Aluno objeto1 = new Aluno("Gabriel", "1234567", 800);
		
//		objeto1.nome = "Gabriel";
//		objeto1.ra = "12345678";
//		objeto1.valor_mensalidade = 800;
		
		objeto1.imprime_aluno();
		
		Aluno objeto2 = new Aluno("Felipe", "14725836", 500);
//		objeto2.nome = "Felipe";
//		objeto2.ra = "14725836";
//		objeto2.valor_mensalidade = 500;
		
		objeto2.imprime_aluno();
		
		Aluno objeto3 = new Aluno("Maria", "36258147", 540);
		objeto3.imprime_aluno();
	}

}
