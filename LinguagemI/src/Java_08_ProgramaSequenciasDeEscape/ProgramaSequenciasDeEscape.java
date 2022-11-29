//Define o pacote que contém esta classe
package Java_08_ProgramaSequenciasDeEscape;

//Cria uma classe pública chamada "ProgramaSequenciasDeEscape"
public class ProgramaSequenciasDeEscape {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Caractere de escape Nova Linha
        System.out.println("Texto01\nTexto02");
    
        //Imprime linha em branco
        System.out.println();
        
        
        //Caractere de escape Retorno
        System.out.println("Texto01\rTexto02");
    
        //Imprime linha em branco
        System.out.println();
        
        
        //Caractere de escape Aspas Duplas
        System.out.println("Texto01\"Texto02");
    
        //Imprime linha em branco
        System.out.println();


        //Caractere de escape Barra Invertida
        System.out.println("Texto01\\Texto02");
    
        //Imprime linha em branco
        System.out.println();        
    }
    
}
