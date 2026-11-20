package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {
	String url = "jdbc:mysql://localhost:3306/mercado";
	String usuario = "root";
	String senha = "1234";

	public Connection conexao() {

		try {

			Connection conn = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada com sucesso");

			return conn;

		} catch (SQLException e) {
			System.out.println("Erro ao realizar a conexão");
			e.printStackTrace();
			return null;
		}

	}

}
