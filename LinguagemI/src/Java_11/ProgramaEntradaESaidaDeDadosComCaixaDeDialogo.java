//Define o pacote que contém esta classe
package Java_11;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaEntradaESaidaDeDadosComCaixaDeDialogo"
public class ProgramaEntradaESaidaDeDadosComCaixaDeDialogo {

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
        
        //Apresentando, em uma caixa de diálogo, um texto concatenado com variáveis com valores calculados
        JOptionPane.showMessageDialog(null, "<<<Resultado>>>\nÁrea: " + area + "\nPerímetro: " + perimetro);
    }
    
}
