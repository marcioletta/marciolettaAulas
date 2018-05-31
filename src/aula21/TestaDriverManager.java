/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 1714290044
 */
public class TestaDriverManager {
    public static void main(String[] args) {
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao =DriverManager.getConnection("jdbc:mysql://localhost/academico","root","");
            String sql = "INSERT INTO alunos(nome,email,data_nasc) VALUES('JOSE','JOSE@IESB','01/01/2000')";
            Statement comando = conexao.createStatement();
            //comando.executeUpdate(sql);
            
            sql= "INSERT INTO ALUNOS(nome,email,data_nasc) VALUES(?,?,?)";
            PreparedStatement insert = conexao.prepareStatement(sql);
            insert.setString(1, "MARIA");
            insert.setString(2, "MARIA@IEB.BR");
            insert.setString(3, "01/01/2000");
            //insert.execute();
            
            sql = "SELECT * FROM ALUNOS";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()){
                System.out.println("id:" + resultado.getInt(1));
                System.out.println("Nome:" + resultado.getString(2));
                System.out.println("Email" + resultado.getString(3));
                System.out.println("DataNasc:" + resultado.getString(4));
            }
            conexao.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("Não foi possível carregar o driver JDBC.Motivo: "+ ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Erro ao chamar MySQL.Motivo: "+ ex.getMessage());
        }
    }
}
