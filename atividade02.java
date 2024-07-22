import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
    
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número a ser localizado: ");
        int numero = scanner.nextInt();
        
        boolean achou = false;
        int posicao = -1;
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numero) {
                achou = true;
                posicao = i;
                break;
            }
        }
        
        if (achou) {
            System.out.println("Achei");
            System.out.printf("Na posição %d está localizado o número %d.\n", posicao, vetor[posicao]);
        } else {
            System.out.println("Número não encontrado no vetor.");
        }
        
        scanner.close();
    }
}
