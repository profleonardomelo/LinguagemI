/*
Usando a classe Scanner para entrada de dados, 
crie uma classe que receba o valor de um produto e a 
porcentagem de desconto, calcule e mostre o valor do desconto 
e o valor do produto com o desconto. Observação: o valor do 
desconto é calculado por meio da fórmula: 
valor do desconto = valor do produto * percentual de desconto/100.
*/

//Define o pacote que contém esta classe
package Java_12_ProgramaExercicioCalcularValorDoProdutoComDesconto;

//Importando classe Scanner
import java.util.Scanner;

//Cria uma classe pública chamada "ProgramaExercicioCalcularValorDoProdutoComDesconto_C"
public class ProgramaExercicioCalcularValorDoProdutoComDesconto_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Exibe na Tela String com título do programa
        System.out.println("<<<< Programa Calculo de Desconto de Produto >>>>\n");
        
        //Cria um objeto com nome leitor, do tipo Scanner 
        Scanner leitor = new Scanner(System.in);
        
        //Exibe na Tela String solicitando que seja digitado dado numérico
        System.out.print("Digite o Valor do Produto: ");
        
        //Lê do teclado um dado do tipo string e convert o dado lido para float
        float valorDoProduto = leitor.nextFloat();
        
        //Exibe na Tela String solicitando que seja digitado dado numérico
        System.out.print("Digite o Percentual de Desconto: ");
        
        //Lê do teclado um dado do tipo string e convert o dado lido para float
        float percentualDeDesconto = leitor.nextFloat();
        
        //Calcula o valor do desconto do produto e armazana o resultado em uma variável do tipo float
        float valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        
        //Exibe na Tela String com o valor do desconto do produto
        System.out.println("Valor do Desconto: " + valorDoDesconto);
        
        //Calcula o valor do produto com desconto e armazana o resultado em uma variável do tipo float
        float valorDoProdutoComDesconto = valorDoProduto - valorDoDesconto;
        
        //Exibe na Tela String com o valor do produto com desconto
        System.out.println("Valor do Produto com Desconto: " + valorDoProdutoComDesconto);
    }
    
}
