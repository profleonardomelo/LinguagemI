//Define o pacote que contém esta classe
package Java_14_ProgramaEstruturasCondicionaisIF;

//Importando a classe JOptionPane para utilização de seus métodos
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaEstruturasCondicionaisIF_C"
public class ProgramaEstruturasCondicionaisIF_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declarando uma variável do tipo String
        String leitura; 
        
        //Delcarando uma variável do tipo int
        int maior; 
        
        //Lendo, em uma caixa de diálogo, um texto 
        leitura = JOptionPane.showInputDialog("Entre com um valor inteiro: ");
        
        //Convertendo um valor do tipo String em int
        int a = Integer.parseInt(leitura);
        
        
        //Lendo, em uma caixa de diálogo, um texto 
        leitura = JOptionPane.showInputDialog("Entre com outro valor inteiro: "); 
        
        //Convertendo um valor do tipo String em int
        int b = Integer.parseInt(leitura);
        
        //Se a maior que b, faça: 
        if(a > b)
        {
            //variável maior recebe o valor de da variável a
            maior = a;
        }
        //Caso contrário
        else
        {
            //variável maior recebe o valor de da variável b
            maior = b;
        }
        
        //Exibe, em uma caixa de diálogo, o maior dos números digitados (lidos) 
        JOptionPane.showMessageDialog(null, "Maior: " + maior);
    }
    
}
