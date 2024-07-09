package service;

import db.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;

public class UserService extends Conexao {

    public UserService() throws SQLException {
        super();
    }

    public void saveUser(User user) {
        String sql = "INSERT INTO tb_user (nome, cpf, rg, dataNasc) VALUES (?, ?, ?, ?)";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getNome());
            pstmt.setString(2, user.getCpf());
            pstmt.setString(3, user.getRg());

            // Convertendo java.util.Date para java.sql.Date
            Date sqlDate = new Date(user.getDataNasc().getTime());
            pstmt.setDate(4, sqlDate);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(); // Fechar a conexão após o uso
        }
    }
}
