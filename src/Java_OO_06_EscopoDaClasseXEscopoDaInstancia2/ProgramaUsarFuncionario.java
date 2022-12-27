package Java_OO_06_EscopoDaClasseXEscopoDaInstancia2;

public class ProgramaUsarFuncionario {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.mostrarInformacoes();
        f2.mostrarInformacoes();
        f3.mostrarInformacoes();

        f1.nome = "João";
        f2.nome = "Maria";
        f3.nome = "Ana";

        f1.mostrarInformacoes();
        f2.mostrarInformacoes();
        f3.mostrarInformacoes();

        Funcionario.valorDoValeRefeicaoDiario = 25;

        f1.mostrarInformacoes();
        f2.mostrarInformacoes();
        f3.mostrarInformacoes();

        Funcionario.alterarValorDoValeRefeicaoDiario(35);

        f1.mostrarInformacoes();
        f2.mostrarInformacoes();
        f3.mostrarInformacoes();



    }
}
