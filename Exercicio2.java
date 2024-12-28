import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // Função do exercício 2 - Função para Calcular o Fatorial de um Número:
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = calcFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }

    public static int calcFatorial(int numero){
        
        if(numero == 0 || numero == 1){
            return 1;
        } else {
            return numero * calcFatorial(numero - 1);
        }

    }

}


