/*
Crie uma classe pública chamada ProgramaUsarConta que possui apenas
o método main.
No método main realize as seguintes instruções:
  -Crie um objeto chamado c01 da classe (do tipo) Conta;
  -Atribua o valor 1234 ao atributo numero do objeto c01;
  -Atribua o valor 1000.0 ao atributo saldo do objeto c01;
  -Atribua o valor 100.0 ao atributo limite do objeto c01;
  -Realize chamada ao método sacar passando como parâmetro o valor 50.0;
  -Realize chamada ao método depositar passando como parâmetro o valor 30.0;
  -Realize chamada ao método MostrarInformacoes.
*/

package Java_OO_03_ExercicioClasseConta;

public class ProgramaUsarConta {

    public static void main(String[] args) {
        Conta c01 = new Conta();

        c01.numero = 1234;
        c01.saldo = 1000;
        c01.limite = 100;

        c01.Sacar(50);
        c01.Depositar(30);
        c01.MostrarInformacoes();
    }

}
