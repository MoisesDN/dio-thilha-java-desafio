package exceptions;

public class ParametrosInvalidosException extends RuntimeException{
    public ParametrosInvalidosException(String msg) {
        super("O segundo parâmetro deve ser maior que o primeiro. ");
    }

}
