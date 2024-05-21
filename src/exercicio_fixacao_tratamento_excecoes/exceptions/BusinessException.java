package exercicio_fixacao_tratamento_excecoes.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException(String msg){
        super(msg);
    }
}
