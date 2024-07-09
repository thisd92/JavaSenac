package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexao {

    protected String servidor;
    protected String banco;
    protected String url;
    protected String usuario;
    protected String senha;
    protected String tabela;
    protected Connection conexao;

    public Conexao() throws SQLException {
        this.servidor = "localhost";
        this.banco = "db_aula_java";
        this.url = "jdbc:mysql://" + servidor + "/" + banco;
        this.usuario = "root";
        this.senha = "";
        this.tabela = "contatos";
        this.conexao = DriverManager.getConnection(url, usuario, senha);
    }

    public Connection getConnection() {
        return this.conexao;
    }

    public void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
