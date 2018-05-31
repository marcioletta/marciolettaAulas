/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula23.negocio;

/**
 *
 * @author 1714290044
 */
public class NegocioException extends Exception{

    public NegocioException(String string) {
        super(string);
    }

    public NegocioException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }
    
}
