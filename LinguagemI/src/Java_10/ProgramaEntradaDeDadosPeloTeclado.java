package Java_10;

import java.util.*;

public class ProgramaEntradaDeDadosPeloTeclado {

    public static void main(String[] args) {
        
        System.out.println("  <<< Progrma Soma >>>>  ");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Entre com primeiro numero: ");
        int x = leitor.nextInt();
        
        System.out.println("Entre com segundo numero: ");
        int y = leitor.nextInt();
        
        
        int soma = x + y;
        
        System.out.println("O resultado da soma e: " + soma);
        
    }
    
}
