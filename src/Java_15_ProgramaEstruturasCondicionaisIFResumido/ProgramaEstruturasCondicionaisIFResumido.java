package Java_15_ProgramaEstruturasCondicionaisIFResumido;

import javax.swing.JOptionPane;

public class ProgramaEstruturasCondicionaisIFResumido {

    public static void main(String[] args) {

        String leitura; 

        int maior; 

        leitura = JOptionPane.showInputDialog("Entre com um valor inteiro: ");
        int a = Integer.parseInt(leitura);
        
        leitura = JOptionPane.showInputDialog("Entre com outro valor inteiro: "); 
        int b = Integer.parseInt(leitura);
        
        maior = (a > b) ? a : b;

        JOptionPane.showMessageDialog(null, "Maior: " + maior);
    }
    
}
