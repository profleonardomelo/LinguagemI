//Define o pacote que contém esta classe
package Java_16_ProgramaEstruturasCondicionaisSwitchCase;

//Importando a classe JOptionPane para utilização de seus métodos
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaEstruturasCondicionaisSwitchCase_C"
public class ProgramaEstruturasCondicionaisSwitchCase_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Lendo um texto através de uma caixa de diálogo
        String mes = JOptionPane.showInputDialog("Forneça o número do mês: ");
        
        //Se a variável mês for diferente de null, faça:
        if(mes != null)
        {
            //Escolha um mês:
            switch (mes) {
                //Caso mês escolhido for igual a "1", faça:
                case "1":
                    //Atribui texto à variável
                    mes = "Janeiro";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "2", faça:
                case "2":
                    //Atribui texto à variável
                    mes = "Fevereiro";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "3", faça:
                case "3":
                    //Atribui texto à variável
                    mes = "Março";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "4", faça:
                case "4":
                    //Atribui texto à variável
                    mes = "Abril";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "5", faça:
                case "5":
                    //Atribui texto à variável
                    mes = "Maio";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "6", faça:
                case "6":
                    //Atribui texto à variável
                    mes = "Junho";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "7", faça:
                case "7":
                    //Atribui texto à variável
                    mes = "Julho";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "8", faça:
                case "8":
                    //Atribui texto à variável
                    mes = "Agosto";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "9", faça:
                case "9":
                    //Atribui texto à variável
                    mes = "Setembro";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "10", faça:
                case "10":
                    //Atribui texto à variável
                    mes = "Outubro";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "11", faça:
                case "11":
                    //Atribui texto à variável
                    mes = "Novembro";
                    //Interrompe comando switch
                    break;
                //Caso mês escolhido for igual a "12", faça:      
                case "12":
                    //Atribui texto à variável
                    mes = "Dezembro";
                    //Interrompe comando switch
                    break;
                //Caso não for escolhida nenhuma das alternativas acima, faça:
                default:
                    //Atribui texto à variável
                    mes = "Mês desconhecido";
            }
            
            //Mostra valor contido em uma variável do tipo String em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, mes);
        }
    }
    
}
