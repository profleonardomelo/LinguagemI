/*
Crie uma classe pública chamada Conta que possui os
atributos públicos: numero (int), saldo (double) e limite (double).
Além disso, a classe Conta deve possuir os métodos: Sacar,
Depositar e MostrarInformacoes.
O método Sacar rebece como parâmetro de entrada um valor a ser sacado,
realiza a operação de saque e não possui saída (returno).
O método Depositar rebece como parâmetro de entrada um valor a ser depositado,
realiza a operação de depósito e não possui saída (returno).
O método MostrarInformacoes não possui parâmetros de entrada, nem saída (retorno) e apenas
imprime na tela (console) as informações contidas nos atributos.
 */

package Java_OO_03_ExercicioClasseConta;

public class Conta {

    public int numero;
    public double saldo;
    public double limite;

    public void Sacar(double valor)
    {
        saldo -=valor;
    }

    public void Depositar(double valor)
    {
        saldo +=valor;
    }

    public void MostrarInformacoes()
    {
        System.out.println("Número: " + numero + "\nSaldo: " + saldo + "\nLimite: " + limite + "\n");
    }
}
