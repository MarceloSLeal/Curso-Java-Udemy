package jdbc;

import java.sql.*;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        String querySelect = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String queryUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        System.out.println("Digite o código do usuário que quer pesquisar SELECT");
        int entradaSelect = entrada.nextInt();

        PreparedStatement stmt = conexao.prepareStatement(querySelect);
        stmt.setInt(1, entradaSelect);

        ResultSet resultadoQuery = stmt.executeQuery();

        if (resultadoQuery.next()) {
            System.out.println(resultadoQuery.getInt("codigo") + " " + resultadoQuery.getString("nome"));
        }



        System.out.println("Digite o novo nome para a pessoa UPDATE");
        entrada.nextLine();
        String entradaUpdate = entrada.nextLine();

        System.out.println(entradaUpdate);


        PreparedStatement stmt2 = conexao.prepareStatement(queryUpdate);

        stmt2.setString(1, entradaUpdate);
        stmt2.setInt(2, entradaSelect);
        stmt2.executeUpdate();

        conexao.close();
        entrada.close();
        stmt.close();
        stmt2.close();
    }

}
