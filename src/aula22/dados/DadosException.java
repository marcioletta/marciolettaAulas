/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22.dados;

/**
 *
 * @author 1714290044
 */
public class DadosException extends Exception{

    public DadosException(String string) {
        super(string);
    }

    public DadosException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }
    
}
