public class Exercicio6 {
    public static void main(String[] args) {
        
        // Exercício 6: Função que Recebe um Array e Retorna o Maior Número

        int[] numeros = {5, 10, 47, 12, 7, 55, 28};

        System.out.println(retornarMaior(numeros));

    }

    public static int retornarMaior(int[] numeros){
            
        int maior = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        return maior;
    }

}
