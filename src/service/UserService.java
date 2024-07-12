package service;

import db.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserService extends Conexao {

    public UserService() throws SQLException {
        super();
    }

    public void saveUser(User user) throws ClassNotFoundException, SQLException {
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
        }
    }

    public List<User> findUsers() throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, nome, cpf, rg, dataNasc FROM tb_user";
        try (Connection conn = this.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                User user = new User();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato desejado
                Date dataNasc = rs.getDate("dataNasc"); // Obtém a data do ResultSet
                if (dataNasc != null) {
                    String dataNascStr = dateFormat.format(dataNasc); // Converte a data para String
                    user.setDataNasc(dataNascStr); // Define a data no objeto user
                } else {
                    user.setDataNasc(null); // Ou um valor padrão em caso de data nula
                }
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setCpf(rs.getString("cpf"));
                user.setRg(rs.getString("rg"));
                //user.setDataNasc(String.valueOf(rs.getDate("dataNasc")));
                users.add(user);
            }
        } catch (SQLException e) {
            throw e;
        }
        return users;
    }

    public void deleteUser(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM tb_user WHERE id = ?";
        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }
    }

    public void updateUser(User user) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE tb_user SET nome = ?, cpf = ?, rg = ?, dataNasc = ? WHERE id = ?";

        try (Connection conn = this.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getNome());
            pstmt.setString(2, user.getCpf());
            pstmt.setString(3, user.getRg());
            Date sqlDate = new Date(user.getDataNasc().getTime());
            pstmt.setDate(4, sqlDate);
            pstmt.setInt(5, user.getId());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
