package Java_10_ProgramaEntradaDeDadosPeloTecladoScanner;

import java.util.Scanner;

public class ProgramaEntradaDeDadosPeloTecladoScanner {

    public static void main(String[] args) {

        System.out.println("  <<< Programa Soma >>>>  ");

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Entre com o seu nome: ");
        String n = leitor.next();
        
        System.out.println("Entre com primeiro numero: ");
        int x = leitor.nextInt();
        
        System.out.println("Entre com segundo numero: ");
        int y = leitor.nextInt();
        
        int soma = x + y;
        
        System.out.println("O resultado da soma e: " + soma);
        System.out.println("Autor(a) do programa: " + n);
    }
    
}
