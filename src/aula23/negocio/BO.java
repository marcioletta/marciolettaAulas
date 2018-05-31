/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula23.negocio;

import java.util.List;

/**
 *
 * @author 1714290044
 */
public interface BO<T> {
 void validar(T entidade) throws NegocioException;
 void inserir(T entidade) throws NegocioException;
 void alterar(T entidade) throws NegocioException;
 void excluir(T entidade) throws NegocioException;
 T consultar(int id) throws NegocioException;
 List<T> listar() throws NegocioException;

}
