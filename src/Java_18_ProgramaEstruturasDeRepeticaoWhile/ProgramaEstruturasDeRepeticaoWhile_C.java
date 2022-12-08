//Define o pacote que contém esta classe
package Java_18_ProgramaEstruturasDeRepeticaoWhile;

//Cria uma classe pública chamada "ProgramaEstruturasDeRepeticaoWhile_C"
public class ProgramaEstruturasDeRepeticaoWhile_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declara e inicializa variável do tipo int que servirá como contador
        int i = 0;
        
        //Repete o código interno da estrutura While 10 vezes
        while (i < 10) {
            //Imprime da tela o valor de uma variável do tipo int concatenado a um texto
            System.out.print(i + " ");
            //Incrementa uma vez variável que serve como contador
            i++;
        }
        
        //Pula uma linha no console, equivalente a imprimir texto com \n
        System.out.println();
        
        //Reinicializa variável do tipo int que servirá como contador
        i = 1;
        
        //Repete o código interno da estrutura Do..While 5 vezes, contador com salto 2
        do {
            //Imprime da tela o valor de uma variável do tipo int concatenado a um texto
            System.out.print(i + " ");
            //Incrementa uma vez variável que serve como contador
            i += 2;
            //Testa condição da estrutura Do..While
        } while (i <= 10);
        
        //Imprime String na tela e coloca o cursor na próxima linha
        System.out.println("\nAcabou!");
    }
    
}