package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

       curso1.adicionarAluno(aluno1);
       curso1.adicionarAluno(aluno2);

       curso2.adicionarAluno(aluno1);
       curso2.adicionarAluno(aluno3);

       aluno1.adicionarCurso(curso3);
       aluno2.adicionarCurso(curso3);
       aluno3.adicionarCurso(curso3);

       for (Aluno aluno: curso3.ALUNOS) {
           System.out.println("Curso -> " + curso3.NOME);
           System.out.println("Nome -> " + aluno.NOME);
       }

        System.out.println("-------");

        System.out.println(aluno1.CURSOS.get(0).ALUNOS);
        System.out.println(aluno1.CURSOS);

        System.out.println("-----------");

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.NOME);
            System.out.println(cursoEncontrado.ALUNOS);
        }


    }
}
