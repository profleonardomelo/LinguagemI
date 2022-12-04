/*
Usando a classe Scanner para entrada de dados, 
crie uma classe que receba o valor de um produto e a 
porcentagem de desconto, calcule e mostre o valor do desconto 
e o valor do produto com o desconto. Observação: o valor do 
desconto é calculado por meio da fórmula: 
valor do desconto = valor do produto * percentual de desconto/100.
*/

package Java_12_ProgramaExercicioCalcularValorDoProdutoComDesconto;

import java.util.Scanner;

public class ProgramaExercicioCalcularValorDoProdutoComDesconto {

    public static void main(String[] args) {

        System.out.println("<<<< Programa Calculo de Desconto de Produto >>>>\n");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o Valor do Produto: ");
        float valorDoProduto = leitor.nextFloat();

        System.out.print("Digite o Percentual de Desconto: ");
        float percentualDeDesconto = leitor.nextFloat();

        
        float valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;

        System.out.println("Valor do Desconto: " + valorDoDesconto);

        
        float valorDoProdutoComDesconto = valorDoProduto - valorDoDesconto;

        System.out.println("Valor do Produto com Desconto: " + valorDoProdutoComDesconto);
    }
    
}
