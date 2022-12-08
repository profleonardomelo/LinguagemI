//Define o pacote que contém esta classe
package Java_08_ProgramaSequenciasDeEscape;

//Cria uma classe pública chamada "ProgramaSequenciasDeEscape_C"
public class ProgramaSequenciasDeEscape_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Caractere de escape Nova Linha
        System.out.println("Texto01\nTexto02");     
        
        //Caractere de escape Retorno
        System.out.println("Texto01\rTexto02");
    
        //Caractere de escape Aspas Duplas
        System.out.println("Texto01\"Texto02");
    
        //Caractere de escape Barra Invertida
        System.out.println("Texto01\\Texto02");
    
        //Imprime linha em branco
        System.out.println();        
    }
    
}
