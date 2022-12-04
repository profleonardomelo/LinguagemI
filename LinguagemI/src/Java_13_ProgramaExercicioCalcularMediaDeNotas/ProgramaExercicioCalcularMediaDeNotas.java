/*
Usando a classe JOptionPane para entrada de dados,
elabore uma classe que receba a nota de duas provas
e de um trabalho. Calcule e mostre a média e o 
resultado final (Se aprovado ou reprovado [não usar IF]). 
Para calcular a média utilize a fórmula seguinte: 
média = (nota da prova 1 + nota da prova 2 
+ nota do trabalho) / 3. 
Considere que a média mínima para aprovação é 6.
Obs.: Não usar comando if.
*/

package Java_13_ProgramaExercicioCalcularMediaDeNotas;

import javax.swing.JOptionPane;

public class ProgramaExercicioCalcularMediaDeNotas {

    public static void main(String[] args) {

        String leitura; 
        
        leitura = JOptionPane.showInputDialog("Entre com a nota da primeira prova: "); 
        float notaProva1 = Float.parseFloat(leitura);
        
        leitura = JOptionPane.showInputDialog("Entre com a nota da segunda prova: "); 
        float notaProva2 = Float.parseFloat(leitura);
        
        leitura = JOptionPane.showInputDialog("Entre com a nota do trabalho final: "); 
        float notaTrabalhoFinal = Float.parseFloat(leitura);

        
        float media = (notaProva1 + notaProva2 + notaTrabalhoFinal) / 3;

        boolean aprovacao = (media >= 6);

        
        String mensagem = "<<<Resultado>>>\nMedia: " + media + "\nAprovação? " + aprovacao;

        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
