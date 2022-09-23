package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));

        System.out.println("--------");

        for (Integer indice: usuarios.keySet()){
            System.out.println(indice + " " + usuarios.get(indice));
        }

        System.out.println("--------");

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        System.out.println("--------");

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        System.out.println("--------");

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey() + " --> " + registro.getValue());
        }

    }

}
