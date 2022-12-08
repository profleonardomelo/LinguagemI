//Define o pacote que contém esta classe
package Java_17_ProgramaEstruturasDeRepeticaoFor;

//Cria uma classe pública chamada "ProgramaEstruturasDeRepeticaoFor_C"
public class ProgramaEstruturasDeRepeticaoFor_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
       
        //Repete o código interno da estrutura For 10 vezes 
        for (int i = 0; i < 10; i++) {
            //Imprime da tela o valor de uma variável do tipo int concatenado a um texto
            System.out.print(i + " ");
        }
        
        //Pula uma linha no console, equivalente a imprimir texto com \n
        System.out.println();
        
        //Repete o código interno da estrutura For 5 vezes, contador com salto 2
        for (int i = 1; i <= 10; i += 2) {
            //Imprime da tela o valor de uma variável do tipo int concatenado a um texto
            System.out.print(i + " ");
        }
        
        //Imprime String na tela e coloca o cursor na próxima linha
        System.out.println("\nAcabou!");
    }
    
}
