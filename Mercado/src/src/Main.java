package src;

public class Main {

	public static void main(String[] args) {
		ConexaoMySql conn = new ConexaoMySql();

		
		ProdutoController produto = new ProdutoController(conn);
		
		produto.ListarProdutos();
	}

}
