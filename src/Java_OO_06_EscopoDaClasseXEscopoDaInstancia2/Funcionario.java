package Java_OO_06_EscopoDaClasseXEscopoDaInstancia2;

public class Funcionario {

    public String nome;
    public static double valorDoValeRefeicaoDiario;

    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome + "\n ValorDoVale: " + valorDoValeRefeicaoDiario + "\n");
    }

    public static void alterarValorDoValeRefeicaoDiario(double valor)
    {
        Funcionario.valorDoValeRefeicaoDiario = valor;
    }
}
