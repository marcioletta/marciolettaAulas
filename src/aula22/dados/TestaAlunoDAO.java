
package aula22.dados;

import aula22.entidades.Aluno;
import java.util.List;

public class TestaAlunoDAO {
    public static void main(String[] args) throws DadosException{
        AlunoDAO dao = new AlunoDAO();
        List<Aluno> lista = dao.listar();
        
        for(Aluno aluno : lista){
            System.out.println(aluno);
        }
        
        Aluno novo = new Aluno();
        novo.setNome("ANTONIO");
        novo.setEmail("ANTONIO@IESB.BR");
        novo.setDataNascimento("01/01/1999");
        
        //dao.inserir(novo);
        
        System.out.println("---------------------");
        
        for(Aluno aluno : lista){
            System.out.println(aluno);
        }
        
        Aluno consulta = dao.consultar(4);
        System.out.println(consulta);
        System.out.println("---------------------");
        
        dao.excluir(consulta);
         
        for(Aluno aluno : lista){
            System.out.println(aluno);
        }
        
    }
}
