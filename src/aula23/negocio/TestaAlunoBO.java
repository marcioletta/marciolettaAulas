/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula23.negocio;

import aula22.entidades.Aluno;
import java.util.List;

public class TestaAlunoBO {
    public static void main(String[] args)throws NegocioException{
        Aluno aluno = new Aluno();
        aluno.setNome("PEDRO");
        aluno.setEmail("PEDRO@IESB.COM.BR");
        aluno.setDataNascimento("20/05/1996");
        
        AlunoBO bo = new AlunoBO();
        
        bo.inserir(aluno);
        
        List<Aluno> lista = bo.listar();
        
        for(Aluno item : lista)
        {
            System.out.println(item);
        }
        
        aluno.setId(0);
        bo.excluir(aluno);
        
    }
}
