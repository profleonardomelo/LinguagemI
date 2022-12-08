//Define o pacote que contém esta classe
package Java_07_ProgramaOperadoresLogicos;

//Cria uma classe pública chamada "ProgramaOperadoresLogicos_C"
public class ProgramaOperadoresLogicos_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declara e inicializa uma variável do tipo boleano
        boolean x = true; 
        
        //Declara e inicializa outra variável do tipo boleano
        boolean y = false; 
        
        //Imprime na tela o valor armazenado em uma variável do tipo boolean
        System.out.println("X: " + x);
        
        //Imprime na tela o valor armazenado em outra variável do tipo boolean
        System.out.println("Y: " + y);
        
        //Imprime na tela o valor resultante da operação de E lógico (AND)
        System.out.println("X e Y: " + (x && y));
        
        //Imprime na tela o valor resultante da operação de OU lógico (OR)
        System.out.println("X ou Y: " + (x || y));
        
        //Imprime na tela o valor resultante da operação de Negação lógico (OR)
        System.out.println("Nao X: " + (!x));
    }
    
}
