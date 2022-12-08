package Java_19_ProgramaTratamentoDeExcecoesTryCatchFinally;

import javax.swing.JOptionPane;

public class ProgramaTratamentoDeExcecoesTryCatchFinally {

    public static void main(String[] args) {
        
        try
        {
            String strNumero1 = JOptionPane.showInputDialog("Forneça o primeiro número:");
            
            int numero1 = 0;
            
            if(!strNumero1.isEmpty()){
                numero1 = Integer.parseInt(strNumero1);
            }
        
            String strNumero2 = JOptionPane.showInputDialog("Forneça o segundo número:");
            
            int numero2 = 0;
            
            if(!strNumero2.isEmpty()){
                numero2 = Integer.parseInt(strNumero2);
            }
        
            JOptionPane.showMessageDialog(null, "Soma: " + (numero1 + numero2));
            JOptionPane.showMessageDialog(null, "Subtração: " + (numero1 - numero2));
            JOptionPane.showMessageDialog(null, "Multiplicação: " + (numero1 * numero2));
            JOptionPane.showMessageDialog(null, "Divisão: " + (numero1 / numero2));
        }
        catch(ArithmeticException erro)
        {
            JOptionPane.showMessageDialog(null, "Divisão por zero.\n" + erro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException erro)
        {
            JOptionPane.showMessageDialog(null, "Conversão.\n" + erro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException erro)
        {
            JOptionPane.showMessageDialog(null, "Tecla Cancel.\n" + erro, "Cancelado", JOptionPane.WARNING_MESSAGE);
        }
        finally
        {
            JOptionPane.showMessageDialog(null, "Final da Execução - Finally");
        }
    }

}
