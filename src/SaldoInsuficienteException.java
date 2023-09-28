public class SaldoInsuficienteException extends RuntimeException{

    //Hierarquia Throwable -> Exception/Error -> Run...(Belongs to Exception)
    //checked exceptions= obrigatório tratar a exceção. Ex: Exception
    //unchecked exceptions= não obrigatório tratar a exceção. Ex: RuntimeException
    //Passando pela classe run... ela se torna não checada, não sendo obrigatório o try catch(tratamento)

    public SaldoInsuficienteException(String objeto){
        super("Saldo Insuficiente " + objeto);
    }

}
