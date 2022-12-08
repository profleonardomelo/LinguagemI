//Define o pacote que contém esta classe
package Java_19_ProgramaTratamentoDeExcecoesTryCatchFinally;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaTratamentoDeExcecoesTryCatchFinally_C"
public class ProgramaTratamentoDeExcecoesTryCatchFinally_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Início do bloco try
        try
        {
            //Lendo, através de uma caixa de diálogo, um texto e atribuindo a uma variável
            String strNumero1 = JOptionPane.showInputDialog("Forneça o primeiro número:");
            
            //Declarando e inicializando variável do tipo int
            int numero1 = 0;
            
            //Testa se a variável de texto lida não está vazia
            if(!strNumero1.isEmpty()){
                //Converte o valor de uma variável do tipo string para int e armazena o valor em outra
                numero1 = Integer.parseInt(strNumero1);
            }
        
            //Lendo, através de uma caixa de diálogo, um texto e atribuindo a uma variável
            String strNumero2 = JOptionPane.showInputDialog("Forneça o segundo número:");
            
            //Declarando e inicializando variável do tipo int
            int numero2 = 0;

            //Testa se a variável de texto lida não está vazia            
            if(!strNumero2.isEmpty()){
                //Converte o valor de uma variável do tipo string para int e armazena o valor em outra
                numero2 = Integer.parseInt(strNumero2);
            }
        
            //Exibe, em uma caixa de diálogo, um texto concatenado com o resultado de operação aritmética
            JOptionPane.showMessageDialog(null, "Soma: " + (numero1 + numero2));
            //Exibe, em uma caixa de diálogo, um texto concatenado com o resultado de operação aritmética
            JOptionPane.showMessageDialog(null, "Subtração: " + (numero1 - numero2));
            //Exibe, em uma caixa de diálogo, um texto concatenado com o resultado de operação aritmética
            JOptionPane.showMessageDialog(null, "Multiplicação: " + (numero1 * numero2));
            //Exibe, em uma caixa de diálogo, um texto concatenado com o resultado de operação aritmética
            JOptionPane.showMessageDialog(null, "Divisão: " + (numero1 / numero2));
        }
        //Início do bloco catch para capturar exceções do tipo ArithmeticException
        catch(ArithmeticException erro)
        {
            //Exibe texto concatenado em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Divisão por zero.\n" + erro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        //Início do bloco catch para capturar exceções do tipo NumberFormatException
        catch(NumberFormatException erro)
        {
            //Exibe texto concatenado em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Conversão.\n" + erro, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        //Início do bloco catch para capturar exceções do tipo NullPointerException
        catch(NullPointerException erro)
        {
            //Exibe texto concatenado em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Tecla Cancel.\n" + erro, "Cancelado", JOptionPane.WARNING_MESSAGE);
        }
        //Início do bloco finally
        finally
        {
            //Exibe texto em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "Final da Execução - Finally");
        }
    }

}
