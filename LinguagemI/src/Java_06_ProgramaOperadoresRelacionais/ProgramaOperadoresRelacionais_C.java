//Define o pacote que contém esta classe
package Java_06_ProgramaOperadoresRelacionais;

//Cria uma classe pública chamada "ProgramaOperadoresRelacionais_C"
public class ProgramaOperadoresRelacionais_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declara e inicializa uma variável do tipo inteiro
        int x = 10; 
        
        //Declara e inicializa outra variável do tipo inteiro
        int y = 3; 
        
        //Imprime na tela o valor armazenado em uma variável do tipo int
        System.out.println("X: " + x);
        
        //Imprime na tela o valor armazenado em outra variável do tipo int
        System.out.println("Y: " + y);
        
        //Imprime na tela o valor resultante da operação de igualdade
        System.out.println("X e igual a Y: " + (x == y));
        
        //Imprime na tela o valor resultante da operação de diferença
        System.out.println("X e diferente a Y: " + (x != y));
        
        //Imprime na tela o valor resultante da operação de maior que
        System.out.println("X e maior que Y: " + (x > y));
        
        //Imprime na tela o valor resultante da operação de maior ou igual a
        System.out.println("X e maior ou igual a Y: " + (x >= y));
        
        //Imprime na tela o valor resultante da operação de menor que
        System.out.println("X e menor que Y: " + (x < y));
        
        //Imprime na tela o valor resultante da operação de menor ou igual a
        System.out.println("X e menor ou igual a Y: " + (x <= y));     
    }
    
}
