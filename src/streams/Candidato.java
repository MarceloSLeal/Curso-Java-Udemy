package streams;

public class Candidato {

    private String nome;
    private String curso;
    private String linguagem;
    private int idade;

    public Candidato(String nome, String curso, String linguagem, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.linguagem = linguagem;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
