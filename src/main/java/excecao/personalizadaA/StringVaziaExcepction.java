package excecao.personalizadaA;

@SuppressWarnings("ALL")
public class StringVaziaExcepction extends RuntimeException{

    private String nomeDoAtributo;

    public StringVaziaExcepction(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }

}
