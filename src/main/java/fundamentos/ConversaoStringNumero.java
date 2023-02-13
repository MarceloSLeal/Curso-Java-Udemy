package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog(null, "Digite um número",
                "Valor1 recebe String", JOptionPane.INFORMATION_MESSAGE);

        String valor2 = JOptionPane.showInputDialog(null, "Digite um número",
                "Valor2 recebe String", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("Soma é " + soma);
        System.out.println("Média é " + (soma /2));

    }

}
