/*
Usando JOptionPane, elabore uma classe que receba o nome de um produto
e o seu valor. O desconto deve ser calculado conforme o valor
fornecido pela Tabela presente no arquivo 
"ProgramaExercicioCalcularValorDoProdutoComDescontoPorFaixaDeValor.png". 
Utilizando a estrutura if-else, apresente em tela o nome do produto, 
valor original do produto e o novo valor após ser realizado o desconto.
Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso. 
Ver exemplo de execução no arquivo 
"ProgramaExercicioCalcularValorDoProdutoComDescontoPorFaixaDeValor.png".
*/

package Java_20_ProgramaExercicioCalcularValorDoProdutoComDescontoPorFaixaDeValor;

import javax.swing.JOptionPane;

public class ProgramaExercicioCalcularValorDoProdutoComDescontoPorFaixaDeValor {

    public static void main(String[] args) {

        String nomeDoProduto = JOptionPane.showInputDialog("Entre com o nome do produto: ");

        String strValorDoProduto = JOptionPane.showInputDialog("Entre com o valor do produto: ");

        float valorDoProduto = Float.parseFloat(strValorDoProduto);

        float valorDoDesconto = 0;
        float percentualDeDesconto = 0;

        if(valorDoProduto >= 50 && valorDoProduto < 200)
        {
            percentualDeDesconto = 5;
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }
        else if(valorDoProduto >= 200 && valorDoProduto < 500)
        {
            percentualDeDesconto = 6;
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }
        else if(valorDoProduto >= 500 && valorDoProduto < 1000)
        {
            percentualDeDesconto = 7;
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }
        else if(valorDoProduto >= 1000)
        {
            percentualDeDesconto = 8;
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }

        float valorDoProdutoComDesconto = valorDoProduto - valorDoDesconto;

        String mensagem = "Nome do produto: " + nomeDoProduto +
                "\nValor do produto: " + valorDoProduto +
                "\nValor do produto com desconto de " + percentualDeDesconto +
                "%: " + valorDoProdutoComDesconto;

        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
