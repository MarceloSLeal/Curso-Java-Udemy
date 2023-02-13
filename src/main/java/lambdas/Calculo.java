package lambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String executar2() {
        return "Teste de método default em interface funcional";
    }

}
