package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.User;
import java.util.Date;
import service.UserService;

public class UserController {

    private UserService userService;
    private SimpleDateFormat dateFormat;

    public UserController() {
        try {
            this.userService = new UserService();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String nome, String cpf, String rg, String dataNasc) {
        User user = new User();
        user.setNome(nome);
        user.setCpf(cpf);
        user.setRg(rg);
        user.setDataNasc(dataNasc);

        userService.saveUser(user);
    }
}
