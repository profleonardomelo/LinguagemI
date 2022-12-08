package Java_11_ProgramaEntradaESaidaDeDadosComCaixaDeDialogo;

import javax.swing.JOptionPane;

public class ProgramaEntradaESaidaDeDadosComCaixaDeDialogo {

    public static void main(String[] args) {
        
        String leitura; 
        
        leitura = JOptionPane.showInputDialog("Entre com o comprimento do retângulo: "); 
        float comprimento = Float.parseFloat(leitura);

        leitura = JOptionPane.showInputDialog("Entre com a largura do retângulo: "); 
        float largura = Float.parseFloat(leitura);
        
        float area = comprimento * largura;
        float perimetro = (comprimento * 2) + (largura * 2);
        
        String mensagem = "<<<Resultado>>>\nÁrea: " + area + "\nPerímetro: " + perimetro;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
