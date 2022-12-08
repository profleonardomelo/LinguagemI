//Define o pacote que contém esta classe
package Java_10_ProgramaEntradaDeDadosPeloTecladoScanner;

//Importando Classes
import java.util.Scanner;

//Cria uma classe pública chamada "ProgramaEntradaDeDadosPeloTecladoScanner_C"
public class ProgramaEntradaDeDadosPeloTecladoScanner_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Imprime na tela um texto e coloca a cursor em uma nova linha
        System.out.println("  <<< Programa Soma >>>>  ");
        
        //Cria um objeto leitor de dados do tipo Scanner
        Scanner leitor = new Scanner(System.in);
        
        //Imprime na tela um texto e coloca a cursor em uma nova linha
        System.out.println("Entre com o seu nome: ");
        
        //Lê do teclado um texto digitado, após ser pressionada a tecla ENTER
        String n = leitor.next();
        
        //Imprime na tela um texto e coloca a cursor em uma nova linha
        System.out.println("Entre com primeiro numero: ");
        
        //Lê do teclado um texto digitado e convert para INT, após ser pressionada a tecla ENTER
        int x = leitor.nextInt();
        
        //Imprime na tela um texto e coloca a cursor em uma nova linha
        System.out.println("Entre com segundo numero: ");
        
        //Lê do teclado um texto digitado e convert para INT, após ser pressionada a tecla ENTER
        int y = leitor.nextInt();
        
        //Soma duas variáveis do tipo INT e atribui o resultado dessa soma a uma terceira variável
        int soma = x + y;
        
        //Imprime na tela um texto concatenado com uma variável e coloca a cursor em uma nova linha
        System.out.println("O resultado da soma e: " + soma);
        
        //Imprime na tela um texto concatenado com uma variável e coloca a cursor em uma nova linha
        System.out.println("Autor(a) do programa: " + n);
    }
    
}
