/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexaoBD {
    public static Connection getConexão()throws DadosException{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/academico","root","");

        } catch (ClassNotFoundException ex) {
            throw new DadosException("Erro ao carregar Driver JDBC", ex);
        } catch (SQLException ex) {
            throw new DadosException("Erro ao conectar no MySQL", ex);
        }   
    }
}

