package excecao.personalizadaB;

@SuppressWarnings("ALL")
public class StringVaziaExcepction extends Exception{

    private String nomeDoAtributo;

    public StringVaziaExcepction(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }

}
