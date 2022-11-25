//Define o pacote que contém esta classe
package Java_10;

//Importando Classes
import java.util.*;

//Cria uma classe pública chamada "ProgramaEntradaDeDadosPeloTeclado"
public class ProgramaEntradaDeDadosPeloTeclado {

    //Cria o método principal (função) "main"
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
