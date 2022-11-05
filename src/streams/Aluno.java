package streams;

public class Aluno {

    final String nome;
    final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString() {
        return nome + " Tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Double.compare(aluno.nota, nota) != 0) return false;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome.hashCode();
        temp = Double.doubleToLongBits(nota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
