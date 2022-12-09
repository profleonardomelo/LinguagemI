//Define o pacote que contém esta classe
package Java_05_ProgramaOperadoresAritmeticos;

//Cria uma classe pública chamada "ProgramaOperadoresAritmeticos_C"
public class ProgramaOperadoresAritmeticos_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declara e inicializa uma variável do tipo inteiro
        int x = 10; 
        
        //Declara e inicializa outra variável do tipo inteiro
        int y = 3; 
        
        //Imprime na tela o valor armazenado numa variável do tipo int
        System.out.println("X: " + x);
        
        //Imprime na tela o valor armazenado em outra variável do tipo int
        System.out.println("Y: " + y);
        
        //Imprime na tela o valor resultante da operação de soma
        //int soma = x + y;
        //System.out.println("Soma de X + Y: " + soma);
        System.out.println("Soma de X + Y: " + (x + y));
        
        //Imprime na tela o valor resultante da operação de subtração
        System.out.println("Subtracao de X - Y: " + (x - y));
                
        //Imprime na tela o valor resultante da operação de multiplicação
        System.out.println("Multiplicacao de X * Y: " + (x * y));
        
        //Imprime na tela o valor resultante da operação de divisão
        System.out.println("Divisao de inteiros de X / Y: " + (x / y));
                
        //Imprime na tela o valor resultante da operação de resto da divisão (MOD) de inteiros
        System.out.println("Resto da divisao de inteiros de X por Y: " + (x % y));

        //Imprime na tela o valor resultante de inversão de sinal
        System.out.println("Inversao de sinal do valor de X: " + (-x)); 
        
        //Imprime na tela o valor resultante de incremento unário
        //System.out.println("Incremento unário do valor de X: " + (x++));
        System.out.println("Incremento unario do valor de X: " + (++x));
        
        //Imprime na tela o valor resultante de decremento unário
        //System.out.println("Incremento unário do valor de X: " + (x--));
        System.out.println("Decremento unario do valor de X: " + (--x));
    }
    
}
