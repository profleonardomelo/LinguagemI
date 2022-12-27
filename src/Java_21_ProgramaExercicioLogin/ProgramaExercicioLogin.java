/*
Faça uma classe que solicite login e senha, simulando
o acesso a um sistema. Considere que os conteúdos de 
login e senha originais são iguais a “java”. O usuário
deverá fornecer login e senha e você irá compará-los
com os conteúdos originais. O usuário tem três chances
para digitar corretamente os dados de login e senha. 
Para cada tentativa incorreta deve aparecer uma 
mensagem alertando o erro e apresentando a quantidade
de tentativas que ainda restam. Veja um exemplo de 
execução no arquivo "ProgramaExercicioLogin.png", em que o usuário já 
digitou o login e senha incorretos por duas vezes, 
restando apenas uma última chance. 
*/

package Java_21_ProgramaExercicioLogin;

import javax.swing.*;

public class ProgramaExercicioLogin {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++)
        {
            String login = JOptionPane.showInputDialog("Forneça um Login: ");
            String senha = JOptionPane.showInputDialog("Forneça uma Senha: ");

            if (login.equals("java") && senha.equals("java")) {
                JOptionPane.showMessageDialog(null, "Login e senha aceitos.");
                break;
            }
            else
            {
                String mensagem = "Falha, verifique login e senha.\nVocê tem mais " + (3 - i) + " tentativa(s).";
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }

    }
    
}
