package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String NOME;
    final List<Curso> CURSOS = new ArrayList<>();

    Aluno(String nome) {
        this.NOME = nome;
    }

    void adicionarCurso(Curso curso) {
        this.CURSOS.add(curso);
        curso.ALUNOS.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        Curso procurado = null;

        for (Curso curso: this.CURSOS) {
            if (curso.NOME.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return null;
    }

    public String toString() {
        return this.NOME;
    }

}
