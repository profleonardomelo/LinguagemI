//Define o pacote que contém esta classe
package Java_11_ProgramaEntradaESaidaDeDadosComCaixaDeDialogo;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaEntradaESaidaDeDadosComCaixaDeDialogo_C"
public class ProgramaEntradaESaidaDeDadosComCaixaDeDialogo_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declaração de uma variável do tipo String
        String leitura; 
        
        //Lendo um texto através de uma caixa de diálogo
        leitura = JOptionPane.showInputDialog("Entre com o comprimento do retângulo: "); 
        
        //Convertendo o texto lido anteriormente para float e armazenando o resultado da conversão em uma variável
        float comprimento = Float.parseFloat(leitura);
        
        //Lendo um texto através de uma caixa de diálogo
        leitura = JOptionPane.showInputDialog("Entre com a largura do retângulo: "); 

        //Convertendo o texto lido anteriormente para float e armazenando o resultado da conversão em uma variável
        float largura = Float.parseFloat(leitura);
        
        //Calculando a área de um retângulo e armazenando seu resultado em uma variável
        float area = comprimento * largura;
        
        //Calculando o perímetro de um retângulo e armazenando seu resultado em uma variável
        float perimetro = (comprimento * 2) + (largura * 2);
        
        //Declara uma variável do tipo String e atribui um texto a ela. Esse texto resulta de concatenações
        String mensagem = "<<<Resultado>>>\nÁrea: " + area + "\nPerímetro: " + perimetro;
        
        //Apresentando, em uma caixa de diálogo, um texto
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
