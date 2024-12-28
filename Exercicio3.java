import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

       //Exercício 3: Função com if-else para Verificar Paridade
       
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um número para saber se ele é ímpar ou par");
       int numero = scanner.nextInt();
       String pariedade = verificarPariedade(numero);

       System.out.println("O número " + numero + " é " + pariedade);

       scanner.close();       
    }

    public static String verificarPariedade(int numero){
        if(numero % 2 == 0){
            return "par";
        } else {
            return "ímpar";
        }
    }
}
