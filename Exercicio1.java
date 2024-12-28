import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    //Exercício 1: Função para Converter Temperatura:

        System.out.println("Digite a temperatura em Celsius para convertem em Fahrenheit:");
        double celsius = scanner.nextDouble();
        double fahrenheit = converterTemp(celsius);
        System.out.println("A teperatura " + celsius + " C equivale a " + fahrenheit + " F");

        scanner.close();
    }

    public static double converterTemp(double celsius){
        return celsius * 1.8 + 32;
    }  

}