/*
Faça uma classe que apresente em tela a tabuada de qualquer número. 
O usuário fornece o número desejado e a classe apresenta a relação 
de todos os cálculos de 1 a 10. Ver exemplo de execução no arquivo 
"ProgramaExercicioTabuada.png".
*/

package Java_22_ProgramaExercicioTabuada;

import javax.swing.JOptionPane;

public class ProgramaExercicioTabuada {

    public static void main(String[] args) {

        String strNumero = JOptionPane.showInputDialog("Forneça um número: ");
        int numero = Integer.parseInt(strNumero);

        String mensagem = "";

        for (int i = 1; i <= 10; i++) {
            mensagem += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
