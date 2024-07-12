package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.User;
import java.util.Date;
import java.util.List;
import service.UserService;

public class UserController {

    private UserService userService;

    public UserController() throws SQLException {
        this.userService = new UserService();
    }

    public void saveUser(String nome, String cpf, String rg, String dataNasc) throws ClassNotFoundException, SQLException {
        User user = new User();
        user.setNome(nome);
        user.setCpf(cpf);
        user.setRg(rg);
        user.setDataNasc(dataNasc);

        userService.saveUser(user);
    }

    public List<User> findUsers() throws SQLException, ClassNotFoundException {
        try {
            return userService.findUsers();

        } catch (SQLException e) {

        }
        return null;

    }

    public void deleteUser(int id) throws ClassNotFoundException, SQLException {
        try {
            userService.deleteUser(id);
        } finally {
            userService.fecharConexao();
        }
    }

    public void updateUser(int id, String nome, String cpf, String rg, String dataNasc) throws ClassNotFoundException, SQLException {
        User user = new User();
        user.setId(id);
        user.setNome(nome);
        user.setCpf(cpf);
        user.setRg(rg);
        user.setDataNasc(dataNasc);

        userService.updateUser(user);
    }
}
