import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {
		final int PRECO_CLASSE_A = 50;
	    final int PRECO_CLASSE_B = 30;
	    final int PRECO_CLASSE_C = 20;
	    
	    int bilhetesClasseA, bilhetesClasseB, bilhetesClasseC;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Quantos bilhetes classe A foram vendidos? ");
	    bilhetesClasseA = scanner.nextInt();
	
	    System.out.print("Quantos bilhetes classe B foram vendidos? ");
	    bilhetesClasseB = scanner.nextInt();
	
	    System.out.print("Quantos bilhetes classe C foram vendidos? ");
	    bilhetesClasseC = scanner.nextInt();
	    
	    int rendaTotal = bilhetesClasseA * PRECO_CLASSE_A +
	            bilhetesClasseB * PRECO_CLASSE_B +
	            bilhetesClasseC * PRECO_CLASSE_C;
	    
	    System.out.println("\nRenda total gerada pela venda dos ingressos: R$ " + rendaTotal);
	    
	    scanner.close();
	}
}
