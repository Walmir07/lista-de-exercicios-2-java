import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        //Exercício 5: Função com System.exit para Verificar Idade
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        verificarIdade(idade);
        verificarIdade(25);

        scanner.close();
    }

    public static void verificarIdade(int idade){
        if(idade < 18){
            System.out.println("Acesso negado");
            System.exit(0);
        }

        System.out.println("Acesso permitido");
        
    }
}
