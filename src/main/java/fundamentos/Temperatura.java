package fundamentos;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Calcula calc = new Calcula();
        Scanner ler = new Scanner(System.in);

        double fahrenheit;
        double celcius;
        double resultado;


        System.out.println("digite valor para fahrenheit");
        fahrenheit = ler.nextDouble();
        System.out.println("digite valor para celcius");
        celcius = ler.nextDouble();


        resultado =  calc.converteTemperatura(fahrenheit, celcius);
        System.out.println("resultado = " + resultado);

    }

}

class Calcula {

    Scanner ler = new Scanner(System.in);
     int escolha;

    public double converteTemperatura(double fah, double cel) {

        System.out.println("Escolha a forma de conversao: \n 1 - converte de Fahrenheit para Celcius \n 2 - converte de Celcius para Fahrenheit");
        double resultado = 0;

        escolha = ler.nextInt();

            if (escolha == 1) {
                resultado = ((fah - 32) * 5) / 9;

            }

            if (escolha == 2) {
                resultado = ((cel * 9) / 5) + 32;
            }

        return resultado;
    }

}


