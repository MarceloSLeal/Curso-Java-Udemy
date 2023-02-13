package fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        // Primitivos iniciando com maiúsculo para adiquirirem as propriedades de classes
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000");
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        //FLoat
        Float f = 123.0F;
        System.out.println(f);

        //Double
        Double d = 1234.568;
        System.out.println(d);

        //boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c.toString() + "...");

    }

}
