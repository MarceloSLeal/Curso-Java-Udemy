package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaExcepction | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

}
