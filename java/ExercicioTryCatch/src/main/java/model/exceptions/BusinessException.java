
package model.exceptions;

public class BusinessException extends Exception{
    private static final long serialVersionUID = 1L;
    
    // Herda as mensagens do Execption.
    public BusinessException(String msg) {
        super(msg);
    }
}
