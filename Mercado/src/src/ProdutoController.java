package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoController {

	ConexaoMySql conexaoMySql;

	public ProdutoController(ConexaoMySql conexaMySql) {
		this.conexaoMySql = conexaMySql;
		this.conexaoMySql.conexao();
	}

	// Conceito CRUD:
	// C = create - insert
	// R = read - select
	// U = update - update
	// D = delete - delete

	public void ListarProdutos() {
		String sql = "SELECT * FROM Produto";
		
	try {
		
		Connection conn = this.conexaoMySql.conexao();
		PreparedStatement qry = conn.prepareStatement(sql);
		ResultSet dados = qry.executeQuery();
		
		while(dados.next()) {
			
			System.out.println(
					dados.getInt("ID") + " " +
					dados.getString("NOME") + " "+ 
					dados.getString("PRECO")
					);
		}
		
	} catch (SQLException e) {
		
		System.out.println("Erro");
	}
	}
}
