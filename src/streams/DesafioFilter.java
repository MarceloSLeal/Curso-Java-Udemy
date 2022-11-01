package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Candidato c1 = new Candidato("Marcelo", "Tecnico", "Java", 42);
        Candidato c2 = new Candidato("Juliana", "Tecnico", "HTML", 30);
        Candidato c3 = new Candidato("Felipe", "Baixarel", "Python", 35);
        Candidato c4 = new Candidato("Carol", "Medio", "JavaScript", 25);
        Candidato c5 = new Candidato("Kelly", "Tecnico", "Kotlin", 21);
        Candidato c6 = new Candidato("Jucelio", "Tecnico", "Java", 38);
        Candidato c7 = new Candidato("Henrique", "Medio", "HTML", 30);
        Candidato c8 = new Candidato("Adriano", "Medio", "JavaScript", 31);
        Candidato c9 = new Candidato("Enzo", "Baixarel", "Java", 27);
        Candidato c10 = new Candidato("Douglas", "Medio", "HTML", 46);

        List<Candidato> listaCandidato = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

        Predicate<Candidato> predicadoCandidato = p -> p.getIdade() >= 30;
        Predicate<Candidato> linguagem = l -> l.getLinguagem().equals("Java");
        Consumer<Candidato> consumidor = c ->
                System.out.println("Candidato " + c.getNome() + " idade " + c.getIdade()
                        + " Linguagem " + c.getLinguagem() + " Selecionado(a)");

        listaCandidato.stream()
                .filter(predicadoCandidato)
                .filter(linguagem)
                .forEach(consumidor);


    }

}
