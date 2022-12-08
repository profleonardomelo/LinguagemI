package Java_14_ProgramaEstruturasCondicionaisIF;

import javax.swing.JOptionPane;

public class ProgramaEstruturasCondicionaisIF {

    public static void main(String[] args) {
        
        String leitura; 
        
        int maior; 
        
        leitura = JOptionPane.showInputDialog("Entre com um valor inteiro: ");
        int a = Integer.parseInt(leitura);
        
        leitura = JOptionPane.showInputDialog("Entre com outro valor inteiro: "); 
        int b = Integer.parseInt(leitura);
        
        if(a > b)
        {
            maior = a;
        }
        else
        {
            maior = b;
        }
        
        JOptionPane.showMessageDialog(null, "Maior: " + maior);
    }
    
}
