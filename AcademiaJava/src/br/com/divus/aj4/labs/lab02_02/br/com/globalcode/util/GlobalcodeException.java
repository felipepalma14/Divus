/**
 * @author Globalcode
 */
package br.com.divus.aj4.labs.lab02_02.br.com.globalcode.util;

public class GlobalcodeException extends Exception {

    public GlobalcodeException(Exception e, String mensagem) {
        super(mensagem, e);
    }

    public GlobalcodeException(String mensagem) {
        super(mensagem);
    }

}
