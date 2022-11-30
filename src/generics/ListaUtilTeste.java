package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //forma explícicta, precisa definir o generics usando casting
        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem1);

        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);

        //uma forma mais implícita, definina dentro do método, não precisa definir nenhum generics
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);

        //uma outra forma de definir o generics, explícita
        Integer ultimoNumero3 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNumero3);

    }

}
