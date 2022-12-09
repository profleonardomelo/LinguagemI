//Define o pacote que contém esta classe
package Java_04_ProgramaConstantes;

//Cria uma classe pública chamada "ProgramaConstantes_C"
public class ProgramaConstantes_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Define e atribui valor a uma constante do tipo double
        final double PI = 3.14;
        
        //Define e atribui valor a uma constante do tipo int
        final int MILISEGUNDOS_POR_SEGUNDO = 1000;
        
        //Define e atribui valor a uma constante do tipo long
        final long MILISEGUNDOS_POR_DIA = 24 * 60 * 60 * MILISEGUNDOS_POR_SEGUNDO;
        
        
        //Não se pode alterar o valor de uma constante
        //MILISEGUNDOS_POR_SEGUNDO = 1001;
        
        //Imprime na tela o valor armazenado numa constante do tipo double
        System.out.println("Valor da constante PI: " + PI);
        
        //Imprime na tela o valor armazenado numa constante do tipo int
        System.out.println("Valor da constante MILISEGUNDOS_POR_SEGUNDO: " + MILISEGUNDOS_POR_SEGUNDO);
        
        //Imprime na tela o valor armazenado numa constante do tipo long
        System.out.println("Valor da constante MILISEGUNDOS_POR_DIA: " + MILISEGUNDOS_POR_DIA);
    }
    
}
