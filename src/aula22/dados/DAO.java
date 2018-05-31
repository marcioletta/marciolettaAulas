/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22.dados;

import java.util.List;

public interface DAO<T> {

    void inserir(T entidade) throws DadosException;

    void alterar(T entidade) throws DadosException;

    void excluir(T entidade) throws DadosException;

    T consultar(int id) throws DadosException;

    List<T> listar() throws DadosException;
}
