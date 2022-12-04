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


//Define o pacote que contém esta classe
package Java_13_ProgramaExercicioCalcularMediaDeNotas;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaExercicioCalcularMediaDeNotas_C"
public class ProgramaExercicioCalcularMediaDeNotas_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declaração de uma variável do tipo String
        String leitura; 
        
        
        //Lendo um texto através de uma caixa de diálogo
        leitura = JOptionPane.showInputDialog("Entre com a nota da primeira prova: "); 
        
        //Convertendo o texto lido anteriormente para float e armazenando o resultado da conversão em uma variável
        float notaProva1 = Float.parseFloat(leitura);
        
        
        //Lendo um texto através de uma caixa de diálogo
        leitura = JOptionPane.showInputDialog("Entre com a nota da segunda prova: "); 
        
        //Convertendo o texto lido anteriormente para float e armazenando o resultado da conversão em uma variável
        float notaProva2 = Float.parseFloat(leitura);
        
        
        //Lendo um texto através de uma caixa de diálogo
        leitura = JOptionPane.showInputDialog("Entre com a nota do trabalho final: "); 
        
        //Convertendo o texto lido anteriormente para float e armazenando o resultado da conversão em uma variável
        float notaTrabalhoFinal = Float.parseFloat(leitura);
        
        
        //Calcula a média aritmética das notas lidas e armazana o resultado em uma variável do tipo float
        float media = (notaProva1 + notaProva2 + notaTrabalhoFinal) / 3;
        
        //Calculando se um(a) estudante foi aprovado(a) ou não e armazenando o resultado em uma variável do tipo boolean
        boolean aprovacao = (media >= 6);
        
        
        //Declara uma variável do tipo String e atribui um texto a ela. Esse texto resulta de concatenações
        String mensagem = "<<<Resultado>>>\nMedia: " + media + "\nAprovação? " + aprovacao;
        
        
        //Apresentando, em uma caixa de diálogo, um texto 
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
