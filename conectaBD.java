/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ConectaBD {
    public Statement stm;//realiza pesquisas no bd
    public ResultSet rs;//armazena o resultado de uma pesquisa
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/sistemaparadigmas";
    private String usuario = "postgres";
    private String senha = "guibmon007";
    public Connection conn;//realiza a conexão com o bd
    
    public void conexao(){//realiza a conexão com o bd
        try {
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão!\n O erro foi: " + ex.getMessage());
            System.exit(0);
        }
    }
    
    public void desconecta(){//desconecta do bd
        try {
            conn.close();//fecha a conexão
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!\n Saindo do programa...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do BD!\n O erro foi: " + ex.getMessage());
        }
    }
}
