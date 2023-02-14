package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);
        String nome = "";

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        while (nome.equals("sair") == false) {
            System.out.println("Digite uma parte de um nome para pesquisar SQL LIKE, sair para sair");
            nome = entrada.nextLine();

            stmt.setString(1, "%" + nome + "%");

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nome1 = resultado.getString("nome");
                System.out.println(codigo + " " + nome1);
            }

        }

        stmt.close();
        conexao.close();
        entrada.close();
    }

}
