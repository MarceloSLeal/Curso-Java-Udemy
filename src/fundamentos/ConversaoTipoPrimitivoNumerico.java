package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        //conversão implícita, onde o java converte altomaticamente
        double a = 1;
        System.out.println(a);

        //conversão explícita, usando o casting para informar o tipo primitivo.
        float b = (float) 1.1234567899999;
        System.out.println(b);

        // conversão explícita com cast e com valores fora do range da variável de destino
        // o java vai "trucar" o valor
        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        // conversão explícita com cast e variável fora do padrão, o java arredonda o resultado
        double e = 1.999999;
        int f = (int) e;
        System.out.println(f);

    }

}
