import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        // Exercício 4: Função com switch para Classificar Notas

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota para ver a sua classificação");
        int nota = scanner.nextInt();

        String classificacao = classificarNota(nota);
        System.out.println("A classificação da nota " + nota + " é: " + classificacao);

        scanner.close();
    }

    public static String classificarNota(int nota){

        if(nota < 0 || nota > 10){
            return "Nota inválida";
        }

        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
